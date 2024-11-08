package com.example.demo.repositories;


import com.example.demo.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassroomRepository extends JpaRepository<Classroom, Integer> {
}
