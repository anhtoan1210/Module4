package com.example.demo.repository;

import com.example.demo.model.QuestionContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<QuestionContent,Long> {
}
