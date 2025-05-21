package com.example.java_project.service;

import com.example.java_project.entity.Category;
import java.util.List;

public interface CategoryService {
    Category save(Category category);
    List<Category> getAll();
    Category getByName(String name);
}