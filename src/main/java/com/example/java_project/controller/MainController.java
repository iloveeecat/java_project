package com.example.java_project.controller;

import com.example.java_project.entity.Flower;
import com.example.java_project.service.FlowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final FlowerService flowerService;

    @GetMapping("/main")
    public String main(Model model) {
        List<Flower> flowers = flowerService.getAllFlowers();
        model.addAttribute("flowers", flowers);
        return "main";
    }
}