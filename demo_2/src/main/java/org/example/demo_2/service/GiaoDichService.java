package org.example.demo_2.service;

import org.example.demo_2.model.GiaoDich;
import org.example.demo_2.repository.IGiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GiaoDichService implements IGiaoDichService {

    @Autowired
    IGiaoDichRepository giaoDichRepository;


    @Override
    public Page<GiaoDich> findAll(Pageable pageable) {
        return giaoDichRepository.findAll(pageable);
    }

    @Override
    public Page<GiaoDich> findByName(Pageable pageable, String name) {
        return giaoDichRepository.findGiaoDichByKhachHang_TenKhachHangContaining(pageable,name);
    }

    @Override
    public void save(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public void delete(GiaoDich giaoDich) {
        giaoDichRepository.delete(giaoDich);
    }

    @Override
    public GiaoDich findById(Integer id) {
        return giaoDichRepository.findById( id).orElse(null);
    }

}
