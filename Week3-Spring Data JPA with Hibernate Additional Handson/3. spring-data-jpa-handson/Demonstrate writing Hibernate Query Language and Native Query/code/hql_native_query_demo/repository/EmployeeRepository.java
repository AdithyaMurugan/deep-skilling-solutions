package com.example.hql_native_query_demo.repository;

import com.example.hql_native_query_demo.entity.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // JPQL/HQL Query
    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findByNameHQL(@Param("name") String name);

    // Aggregate function - Count
    @Query("SELECT COUNT(e) FROM Employee e")
    long countEmployees();

    // Native SQL
    @Query(value = "SELECT * FROM employee WHERE name = :name", nativeQuery = true)
    List<Employee> findByNameNative(@Param("name") String name);

    // Native SQL with filter
    @Query(value = "SELECT * FROM employee WHERE salary > :amount", nativeQuery = true)
    List<Employee> findHighSalaryNative(@Param("amount") double salary);
}
