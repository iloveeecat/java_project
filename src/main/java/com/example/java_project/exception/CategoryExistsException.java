package com.example.java_project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Категория уже создана")
public class CategoryExistsException extends RuntimeException {
}
