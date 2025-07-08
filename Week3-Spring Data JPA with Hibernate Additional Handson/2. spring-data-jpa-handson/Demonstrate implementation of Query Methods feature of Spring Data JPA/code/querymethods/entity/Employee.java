package com.example.querymethods.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private double salary;

    private LocalDate joinDate; // for date-based queries

    // Getters and Setters
}
