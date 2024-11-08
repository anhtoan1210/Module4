package org.example.demo_aa.repository;

import org.example.demo_aa.model.QuestionContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<QuestionContent,Long> {
}
