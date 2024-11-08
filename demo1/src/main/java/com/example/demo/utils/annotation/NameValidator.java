package com.example.demo.utils.annotation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.example.demo.repositories.IClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NameValidator implements ConstraintValidator<com.example.demo.utils.annotation.NameConstraint, String> {

    @Autowired
    private IClassroomRepository iClassroomRepository;
    @Override
    public void initialize(com.example.demo.utils.annotation.NameConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.matches("[A-Za-z ]{4,}");
    }
}
