package com.example.java_project.repository;

import com.example.java_project.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
    Optional<Flower> findByName(String name);
}