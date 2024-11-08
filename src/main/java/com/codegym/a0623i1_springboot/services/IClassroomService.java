package com.codegym.a0623i1_springboot.services;

import com.codegym.a0623i1_springboot.models.Classroom;

import java.util.List;

public interface IClassroomService {
    List<Classroom> findAll();
}
