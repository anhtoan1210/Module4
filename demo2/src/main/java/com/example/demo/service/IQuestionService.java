package com.example.demo.service;

import com.example.demo.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionService {
    Page<QuestionContent> findAll(Pageable pageable);

    void save(QuestionContent questionContent);

    void delete(QuestionContent questionContent);

    QuestionContent findById(Long id);

    List<QuestionContent> findAll();
}
