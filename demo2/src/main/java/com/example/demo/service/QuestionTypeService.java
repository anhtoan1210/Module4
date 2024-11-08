package com.example.demo.service;

import com.example.demo.model.QuestionType;
import com.example.demo.repository.IQuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService implements IQuestionTypeService{
    @Autowired
    private IQuestionTypeRepository iQuestionTypeRepository;
    @Override
    public List<QuestionType> listQuestionType() {
        return iQuestionTypeRepository.findAll();
    }
}
