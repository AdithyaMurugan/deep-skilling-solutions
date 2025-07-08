package com.example.orm_mapping_demo;


import com.example.orm_mapping_demo.entity.*;
import com.example.orm_mapping_demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class OrMappingDemoApplication implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private ProjectRepository projectRepo;

    public static void main(String[] args) {
        SpringApplication.run(OrMappingDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Department dept = new Department();
        dept.setName("IT");
        departmentRepo.save(dept);

        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setDepartment(dept);

        Employee emp2 = new Employee();
        emp2.setName("Alice");
        emp2.setDepartment(dept);

        employeeRepo.saveAll(Arrays.asList(emp1, emp2));

        Project proj = new Project();
        proj.setTitle("Spring Boot O/R Mapping");
        proj.setEmployees(Arrays.asList(emp1, emp2));
        projectRepo.save(proj);
    }
}
