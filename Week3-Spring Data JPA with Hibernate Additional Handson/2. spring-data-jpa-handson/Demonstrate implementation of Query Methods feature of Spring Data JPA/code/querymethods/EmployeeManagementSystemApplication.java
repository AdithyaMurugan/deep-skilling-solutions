package com.example.querymethods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.querymethods.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;


@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }

   
    @Override
    public void run(String... args) throws Exception {
        System.out.println(service.searchByNameContains("John"));
        System.out.println(service.filterByPrefix("A"));
        System.out.println(service.getBySalaryGreaterThan(50000));
        System.out.println(service.getByJoinDateRange(LocalDate.of(2023, 1, 1), LocalDate.now()));
        System.out.println(service.getSortedByDepartment("IT"));
        System.out.println(service.getTop3HighestPaid());
    }
}
