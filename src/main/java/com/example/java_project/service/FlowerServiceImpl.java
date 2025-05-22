package com.example.java_project.service;

import com.example.java_project.entity.Flower;
import com.example.java_project.exception.FlowerExistsException;
import com.example.java_project.repository.FlowerRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Service
public class FlowerServiceImpl implements FlowerService {

    private FlowerRepository flowerRepository;
    private CategoryService categoryService;

    @Override
    public Flower save(Flower flower) {
        Optional<Flower> existedFlower = flowerRepository.findByName(flower.getName());
        if (existedFlower.isPresent()) throw new FlowerExistsException();
        flower.setCategories(flower
                .getCategories()
                .stream()
                .parallel()
                .map(category -> categoryService.getByName(category.getName()))
                .collect(Collectors.toSet())
        );
        return flowerRepository.save(flower);
    }

    @Override
    public List<Flower> getAll() {
        return flowerRepository.findAll();
    }
}