package com.codegym.a0623i1_springboot.services.impl;

import com.codegym.a0623i1_springboot.models.Classroom;
import com.codegym.a0623i1_springboot.repositories.IClassroomRepository;
import com.codegym.a0623i1_springboot.services.IClassroomService;
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
