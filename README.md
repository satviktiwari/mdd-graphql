# Financial Services API

A Spring Boot application exposing financial data via **REST** and **GraphQL**, powered by a metadata-driven architecture — no hardcoded POJOs or controllers per table.

## Tech Stack

- Java 25
- Spring Boot 3.5.0
- Spring Data JPA
- Spring GraphQL
- H2 In-Memory Database
- Maven

## Project Structure

```
src/main/java/com/example/financialservices/
├── controller/
│   ├── DynamicApiController.java       # REST: /api/{apiName}
│   └── DynamicGraphQLController.java   # GraphQL queries
├── model/
│   ├── ApiMetadata.java
│   ├── ApiJoinConfig.java
│   ├── ColumnMapping.java
│   └── graphql/
│       ├── Field.java
│       ├── DynamicRow.java
│       ├── DynamicResponse.java
│       ├── JoinedRow.java
│       ├── JoinedResponse.java
│       ├── RelatedEntity.java
│       └── ApiInfo.java
├── repository/
│   ├── ApiMetadataRepository.java
│   ├── ColumnMappingRepository.java
│   └── ApiJoinConfigRepository.java
└── service/
    └── DynamicApiService.java

src/main/resources/
├── graphql/
│   └── schema.graphqls
├── schema.sql
├── data.sql
└── application.properties
```

## Database Tables

| Table | Purpose |
|---|---|
| `worker_data` | Internal analysts/employees |
| `company_data` | Client companies we service |
| `coverage_data` | Which worker covers which company |
| `api_metadata` | Registered APIs — name, source table, SQL to execute |
| `column_mapping` | Columns to expose per API — display name, type, order |
| `api_join_config` | FK relationships between APIs for stitched responses |

## Running the App

```bash
mvn clean spring-boot:run
```

App starts at `http://localhost:8080`

## REST API

Base URL: `/api/{apiName}`

| Endpoint | Returns |
|---|---|
| `GET /api/worker` | All workers |
| `GET /api/company` | All companies |
| `GET /api/coverage` | All coverage records |

Adding a new endpoint requires only an INSERT into `api_metadata` and `column_mapping` — no code changes.

## GraphQL API

Endpoint: `POST /graphql`  
Playground: `http://localhost:8080/graphiql`

### Fetch any API dynamically

```graphql
query {
    fetchApi(apiName: "worker") {
        apiName
        totalRows
        rows {
            fields { key value }
        }
    }
}
```

### Fetch stitched data across tables

```graphql
query {
    fetchJoined(apiName: "coverage") {
        apiName
        totalRows
        rows {
            fields { key value }
            related {
                entity
                fields { key value }
            }
        }
    }
}
```

### Discover available APIs

```graphql
query {
    listApis {
        apiName
        description
        sourceTable
        columnCount
    }
}
```

## H2 Console

URL: `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:financialdb`  
Username: `sa`  
Password: *(leave blank)*

## How the Metadata Architecture Works

```
Request: GET /api/coverage  or  fetchJoined(apiName: "coverage")
            ↓
  Lookup api_metadata WHERE api_name = 'coverage'
            ↓
  Get SQL + visible columns from column_mapping
            ↓
  Execute SQL via JdbcTemplate
            ↓
  Check api_join_config for FK relationships
            ↓
  Fetch related worker + company rows
            ↓
  Shape and return unified response
```