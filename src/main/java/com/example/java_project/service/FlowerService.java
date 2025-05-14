package com.example.java_project.service;

import com.example.java_project.DTO.FlowerDTO;
import com.example.java_project.entity.Flower;
import com.example.java_project.repository.FlowerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlowerService {

    private final FlowerRepository flowerRepository;

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    public Flower addFlower(FlowerDTO flowerDTO) {
        Flower flower = new Flower();
        flower.setName(flowerDTO.getName());
        flower.setPrice(flowerDTO.getPrice());
        flower.setDescription(flowerDTO.getDescription());
        flower.setImageUrl(flowerDTO.getImageUrl());
        return flowerRepository.save(flower);
    }

    public Flower updateFlower(Long id, FlowerDTO flowerDTO) {
        Optional<Flower> optionalFlower = flowerRepository.findById(id);
        if (optionalFlower.isPresent()) {
            Flower flower = optionalFlower.get();
            flower.setName(flowerDTO.getName());
            flower.setPrice(flowerDTO.getPrice());
            flower.setDescription(flowerDTO.getDescription());
            flower.setImageUrl(flowerDTO.getImageUrl());
            return flowerRepository.save(flower);
        }
        return null;
    }

    public void deleteFlower(Long id) {
        flowerRepository.deleteById(id);
    }
}