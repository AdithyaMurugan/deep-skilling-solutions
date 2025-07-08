package com.example.orm_mapping_demo.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employees;
    public void setName(String name) {
        this.name = name;
    }
}
