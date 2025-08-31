package com.example.jdbc_demo.repository;

import com.example.jdbc_demo.entity.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentsRepository  extends JpaRepository<Dependent, Integer> {
}
