package com.example.demo.services.impl;


import com.example.demo.models.Classroom;
import com.example.demo.repositories.IClassroomRepository;
import com.example.demo.services.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {

    @Autowired
    private IClassroomRepository classroomRepository;

    @Override
    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }
}
