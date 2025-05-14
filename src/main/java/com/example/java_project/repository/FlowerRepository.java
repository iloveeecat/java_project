package com.example.java_project.repository;

import com.example.java_project.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
}