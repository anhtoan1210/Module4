package com.example.thimodule4.service;

import com.example.thimodule4.model.Khachhang;
import com.example.thimodule4.repository.IKhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachhangService implements IKhachhangService {
    @Autowired
    private IKhachhangRepository khachhangRepository;
    @Override
    public List<Khachhang> hienThi() {
        return khachhangRepository.findAll() ;
    }
}
