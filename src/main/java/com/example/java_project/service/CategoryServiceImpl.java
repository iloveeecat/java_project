package com.example.java_project.service;

import com.example.java_project.entity.Category;
import com.example.java_project.exception.CategoryExistsException;
import com.example.java_project.exception.CategoryMissingException;
import com.example.java_project.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        Optional<Category> existedCategory = categoryRepository.findByName(category.getName());
        if (existedCategory.isPresent()) throw new CategoryExistsException();
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getByName(String name) {
        return categoryRepository.findByName(name).orElseThrow(CategoryMissingException::new);
    }
}
