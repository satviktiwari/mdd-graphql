package com.example.financialservices.repository;

import com.example.financialservices.model.WorkerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerDataRepository extends JpaRepository<WorkerData, Long> {

    List<WorkerData> findByIsActive(Boolean isActive);

    List<WorkerData> findByDepartmentIgnoreCase(String department);
}
