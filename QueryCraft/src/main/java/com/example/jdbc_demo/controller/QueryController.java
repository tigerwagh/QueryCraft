package com.example.jdbc_demo.controller;

import com.example.jdbc_demo.service.QueryService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/query")
public class QueryController {

    @Autowired
    private QueryService queryService;
    @Autowired
    private ObjectMapper objectMapper;



    // Get all employees
    @GetMapping("/employees")
    public List<Map<String, Object>> getEmployees() {
        return queryService.getAllEmployees();
    }

    // Get all dependents
    @GetMapping("/dependents")
    public List<Map<String, Object>> getDependents() {
        return queryService.getAllDependents();
    }

    // Get employee details with department and project info
    @GetMapping("/employee-details")
    public List<Map<String, Object>> getEmployeeDetails() {
        return queryService.getEmployeeDetails();
    }

    @GetMapping("/run")
    public List<Map<String, Object>> runQuery(@RequestParam String sqlFile) throws Exception {
        return queryService.runQueryFromFile(sqlFile);
    }

    @GetMapping("/run1")
    public JsonNode runQuery(@RequestParam String sqlFile,
                             @RequestParam String jsonFile) throws Exception{
        List<JsonNode> data = queryService.runQueryWithTemplate(sqlFile, jsonFile);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.valueToTree(data);
    }




}
