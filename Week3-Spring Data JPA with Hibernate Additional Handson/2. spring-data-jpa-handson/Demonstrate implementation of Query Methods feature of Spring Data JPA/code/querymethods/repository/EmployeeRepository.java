package com.example.querymethods.repository;
import com.example.querymethods.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Containing text
    List<Employee> findByNameContaining(String keyword);

    // Starts with
    List<Employee> findByNameStartingWith(String prefix);

    // Greater than salary
    List<Employee> findBySalaryGreaterThan(double amount);

    // Less than salary
    List<Employee> findBySalaryLessThan(double amount);

    // Between dates
    List<Employee> findByJoinDateBetween(LocalDate start, LocalDate end);

    // Sorting
    List<Employee> findByDepartmentOrderByNameAsc(String department);

    // Top N records
    List<Employee> findTop3ByOrderBySalaryDesc();
}
