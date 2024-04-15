package org.example.demo_thi.controller;

import jakarta.validation.Valid;
import org.example.demo_thi.dto.QuestionContentDto;
import org.example.demo_thi.model.QuestionContent;
import org.example.demo_thi.service.IQuestionService;
import org.example.demo_thi.service.IQuestionTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/questions")
public class QuestionRestController {
    @Autowired
    private IQuestionService iQuestionService;

    @GetMapping("/{id}")
    public ResponseEntity<QuestionContent> showQuestionFindById(@PathVariable Long id) {
        QuestionContent questionContent = iQuestionService.findById(id);
        if (questionContent == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(questionContent, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<QuestionContent>> showList() {
        List<QuestionContent> list = iQuestionService.findAll();
        if (list == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody QuestionContent questionContent) {
        if(questionContent == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        iQuestionService.save(questionContent);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/update")
    public ResponseEntity<?> edit(@RequestBody QuestionContent questionContent) {
        QuestionContent questionContent1 = iQuestionService.findById(questionContent.getIdQuestionContent());
        if(questionContent1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iQuestionService.save(questionContent1);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        QuestionContent questionContent = iQuestionService.findById(id);
        if(questionContent == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iQuestionService.delete(questionContent);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
