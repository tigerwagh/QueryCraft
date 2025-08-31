package com.example.jdbc_demo.repository;

import com.example.jdbc_demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
