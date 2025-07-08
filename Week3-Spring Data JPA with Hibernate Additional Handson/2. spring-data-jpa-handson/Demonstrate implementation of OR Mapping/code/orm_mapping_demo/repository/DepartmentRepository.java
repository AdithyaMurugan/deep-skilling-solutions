package com.example.orm_mapping_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orm_mapping_demo.entity.Department;
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
