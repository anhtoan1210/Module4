package com.codegym.a0623i1_springboot.repositories;

import com.codegym.a0623i1_springboot.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassroomRepository extends JpaRepository<Classroom, Integer> {
}
