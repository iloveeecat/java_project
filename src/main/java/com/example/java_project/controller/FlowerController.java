package com.example.java_project.controller;

import com.example.java_project.DTO.FlowerDTO;
import com.example.java_project.entity.Flower;
import com.example.java_project.service.FlowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/flowers")
@RequiredArgsConstructor
public class FlowerController {


//    private final FlowerService flowerService;
//
//    @GetMapping
//    public ResponseEntity<List<Flower>> getAllFlowers() {
//        List<Flower> flowers = flowerService.getAllFlowers();
//        return ResponseEntity.ok(flowers);
//    }
//
//    @PostMapping
//    public ResponseEntity<Flower> addFlower(@RequestBody FlowerDTO flowerDTO) {
//        Flower flower = flowerService.addFlower(flowerDTO);
//        return new ResponseEntity<>(flower, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Flower> updateFlower(@PathVariable Long id, @RequestBody FlowerDTO flowerDTO) {
//        Flower updatedFlower = flowerService.updateFlower(id, flowerDTO);
//        return ResponseEntity.ok(updatedFlower);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteFlower(@PathVariable Long id) {
//        flowerService.deleteFlower(id);
//        return ResponseEntity.noContent().build();
//    }
}