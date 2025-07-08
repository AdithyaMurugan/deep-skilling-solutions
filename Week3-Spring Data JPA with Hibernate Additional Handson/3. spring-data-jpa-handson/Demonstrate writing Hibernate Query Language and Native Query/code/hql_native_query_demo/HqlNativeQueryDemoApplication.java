package com.example.hql_native_query_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hql_native_query_demo.entity.Employee;
import com.example.hql_native_query_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HqlNativeQueryDemoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepo;

    public static void main(String[] args) {
        SpringApplication.run(HqlNativeQueryDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        employeeRepo.save(new Employee("John", 60000));
        employeeRepo.save(new Employee("Alice", 75000));
        employeeRepo.save(new Employee("Bob", 50000));

        System.out.println("\n🔍 HQL - Find by name:");
        employeeRepo.findByNameHQL("Alice").forEach(e -> System.out.println(e.getName()));

        System.out.println("\n📊 Count of employees:");
        System.out.println(employeeRepo.countEmployees());

        System.out.println("\n🧾 Native - Find by name:");
        employeeRepo.findByNameNative("John").forEach(e -> System.out.println(e.getName()));

        System.out.println("\n💰 Native - High salary > 55000:");
        employeeRepo.findHighSalaryNative(55000).forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
    }
}
