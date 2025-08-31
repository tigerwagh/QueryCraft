package com.example.jdbc_demo.repository;

import com.example.jdbc_demo.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
