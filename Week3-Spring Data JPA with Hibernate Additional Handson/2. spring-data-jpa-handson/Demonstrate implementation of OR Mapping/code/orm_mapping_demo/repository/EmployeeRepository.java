package com.example.orm_mapping_demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orm_mapping_demo.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
