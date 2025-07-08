package com.example.orm_mapping_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orm_mapping_demo.entity.Project;
public interface ProjectRepository extends JpaRepository<Project, Long> {}
