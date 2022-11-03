package com.example.springbootintro.controller;

import com.example.springbootintro.model.error.ValidationErrorResponse;
import com.example.springbootintro.model.error.Violation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ErrorHandlerControllerAdvice {

    @ResponseBody
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationErrorResponse onConstraintError(ConstraintViolationException exc) {
        List<Violation> violations = exc.getConstraintViolations().stream()
                .map(v -> new Violation(v.getPropertyPath().toString(), v.getMessage()))
                .collect(Collectors.toList());
        return new ValidationErrorResponse(violations);
    }

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationErrorResponse onMethodArgumentNotValidError(MethodArgumentNotValidException exc) {
        List<Violation> violations = exc.getBindingResult().getFieldErrors().stream()
                .map(v -> new Violation(v.getField(), v.getDefaultMessage()))
                .collect(Collectors.toList());
        return new ValidationErrorResponse(violations);
    }

}
