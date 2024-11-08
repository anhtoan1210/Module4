package org.example.demo_thi.service;

import org.example.demo_thi.model.DoanhNghiep;
import org.example.demo_thi.repository.IDoanhNghiepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoanhNghiepService implements  IDoanhNghiepService{
    @Autowired
    private IDoanhNghiepRepository doanhNghiepRepository;
    @Override
    public List<DoanhNghiep> findAll() {
        return doanhNghiepRepository.findAll();
    }
}
