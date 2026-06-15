package com.example.financialservices.controller;

import com.example.financialservices.exception.ApiNotFoundException;
import com.example.financialservices.service.DynamicApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DynamicApiController {

    private final DynamicApiService service;

    public DynamicApiController(DynamicApiService service) {
        this.service = service;
    }

    @GetMapping("/{apiName}")
    public ResponseEntity<?> handleRequest(@PathVariable String apiName) {
        try {
            List<Map<String, Object>> result = service.execute(apiName);
            return ResponseEntity.ok(result);
        } catch (ApiNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", ex.getMessage()));
        }
    }
}