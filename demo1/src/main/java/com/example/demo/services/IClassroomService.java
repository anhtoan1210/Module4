package com.example.demo.services;

import com.example.demo.models.Classroom;

import java.util.List;

public interface IClassroomService {
    List<Classroom> findAll();
}
