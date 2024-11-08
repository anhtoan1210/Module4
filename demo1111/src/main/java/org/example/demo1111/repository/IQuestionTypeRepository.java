package org.example.demo_aa.repository;

import org.example.demo_aa.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionTypeRepository extends JpaRepository<QuestionType,Long> {

}
