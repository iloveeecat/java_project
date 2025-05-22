package com.example.java_project.service;

import com.example.java_project.entity.Flower;
import java.util.List;

public interface FlowerService {
    Flower save(Flower flower);
    List<Flower> getAll();
}