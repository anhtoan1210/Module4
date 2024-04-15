package org.example.demo_thi.repository;

import org.example.demo_thi.model.QuestionContent;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<QuestionContent,Long> {
}
