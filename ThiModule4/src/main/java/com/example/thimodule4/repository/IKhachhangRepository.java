package com.example.thimodule4.repository;

import com.example.thimodule4.model.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface IKhachhangRepository extends JpaRepository<Khachhang, Long> {
}
