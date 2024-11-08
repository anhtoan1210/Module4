package com.example.demo.services.impl;


import com.example.demo.models.Student;
import com.example.demo.repositories.IStudentRepository;
import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {

        return studentRepository.searchByName("%" + "Hai" + "%");
    }

    @Override
    public void save(Student student) {
//        Validate dữ liệu, format, trùng lặp, codeClass có tồn tại không
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllByName(String name) {
        return studentRepository.searchByName("%" + name + "%");
    }

    @Override
    public Page<Student> findAllByName(String name, Pageable pageable) {
        return studentRepository.searchByName("%" + name + "%", pageable);
    }

    @Override
    public void deleteById(Integer code) {
        studentRepository.deleteById(code);
    }
}
