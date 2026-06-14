package com.example.financialservices.controller;

import com.example.financialservices.model.WorkerData;
import com.example.financialservices.repository.WorkerDataRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worker")
public class WorkerController {

    private final WorkerDataRepository repo;

    public WorkerController(WorkerDataRepository repo) {
        this.repo = repo;
    }

    /** GET /api/worker  — returns all workers */
    @GetMapping
    public List<WorkerData> getAllWorkers() {
        return repo.findAll();
    }

    /** GET /api/worker/{id}  — returns a single worker */
    @GetMapping("/{id}")
    public ResponseEntity<WorkerData> getWorkerById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /** GET /api/worker?active=true|false  — filter by active status */
    @GetMapping(params = "active")
    public List<WorkerData> getWorkersByStatus(@RequestParam Boolean active) {
        return repo.findByIsActive(active);
    }

    /** GET /api/worker?department=Equity+Research  — filter by department */
    @GetMapping(params = "department")
    public List<WorkerData> getWorkersByDepartment(@RequestParam String department) {
        return repo.findByDepartmentIgnoreCase(department);
    }
}
