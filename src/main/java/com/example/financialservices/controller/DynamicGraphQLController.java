package com.example.financialservices.controller;

import com.example.financialservices.model.graphql.*;
import com.example.financialservices.service.DynamicApiService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class DynamicGraphQLController {

    private final DynamicApiService service;

    public DynamicGraphQLController(DynamicApiService service) {
        this.service = service;
    }

    // Single entry point — consumers pass apiName as argument
    @QueryMapping
    public DynamicResponse fetchApi(@Argument String apiName) {
        return service.executeForGraphQL(apiName);
    }

    // Discovery endpoint — what APIs exist?
    @QueryMapping
    public List<ApiInfo> listApis() {
        return service.listApis();
    }
}