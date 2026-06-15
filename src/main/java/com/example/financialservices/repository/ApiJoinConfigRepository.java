package com.example.financialservices.repository;

import com.example.financialservices.model.ApiJoinConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiJoinConfigRepository extends JpaRepository<ApiJoinConfig, Long> {
    List<ApiJoinConfig> findByParentApiId(Long parentApiId);
}
