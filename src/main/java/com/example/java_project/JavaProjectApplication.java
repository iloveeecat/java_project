package com.example.java_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.java_project")
public class JavaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaProjectApplication.class, args);
    }

}
