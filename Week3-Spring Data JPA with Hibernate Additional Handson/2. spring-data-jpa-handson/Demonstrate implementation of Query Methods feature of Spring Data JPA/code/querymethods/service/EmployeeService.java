package com.example.querymethods.service;

import com.example.querymethods.entity.Employee;
import com.example.querymethods.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
   
    


    public List<Employee> searchByNameContains(String keyword) {
        return employeeRepository.findByNameContaining(keyword);
    }

    public List<Employee> filterByPrefix(String prefix) {
        return employeeRepository.findByNameStartingWith(prefix);
    }

    public List<Employee> getBySalaryGreaterThan(double salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }

    public List<Employee> getBySalaryLessThan(double salary) {
        return employeeRepository.findBySalaryLessThan(salary);
    }

    public List<Employee> getByJoinDateRange(LocalDate start, LocalDate end) {
        return employeeRepository.findByJoinDateBetween(start, end);
    }

    public List<Employee> getSortedByDepartment(String dept) {
        return employeeRepository.findByDepartmentOrderByNameAsc(dept);
    }

    public List<Employee> getTop3HighestPaid() {
        return employeeRepository.findTop3ByOrderBySalaryDesc();
    }
}