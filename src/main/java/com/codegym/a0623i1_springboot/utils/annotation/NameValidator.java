package com.codegym.a0623i1_springboot.utils.annotation;

import com.codegym.a0623i1_springboot.repositories.IClassroomRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class NameValidator implements ConstraintValidator<NameConstraint, String> {

    @Autowired
    private IClassroomRepository iClassroomRepository;
    @Override
    public void initialize(NameConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return value.matches("[A-Za-z ]{4,}");
    }
}
