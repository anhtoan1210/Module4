package com.example.demo.service;

import com.example.demo.model.DanhMuc;
import com.example.demo.repository.IDanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class danhMucService implements IDanhMucService{
    @Autowired
    IDanhMucRepository iDanhMucRepository;
    @Override
    public List<DanhMuc> hienThi() {
        return iDanhMucRepository.findAll();
    }
}
