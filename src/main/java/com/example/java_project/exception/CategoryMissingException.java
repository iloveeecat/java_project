package com.example.java_project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Неверная категория")
public class CategoryMissingException extends RuntimeException {
}
