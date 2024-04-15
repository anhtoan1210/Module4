package org.example.demo_thi.service;

import org.example.demo_thi.model.QuestionType;
import org.example.demo_thi.repository.IQuestionTypeRepository;
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
