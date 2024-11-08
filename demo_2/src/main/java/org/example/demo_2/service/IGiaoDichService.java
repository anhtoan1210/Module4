package org.example.demo_2.service;

import org.example.demo_2.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGiaoDichService {
    Page<GiaoDich> findAll(Pageable pageable);
    Page<GiaoDich> findByName(Pageable pageable,String name);


    void save(GiaoDich giaoDich);

    void delete(GiaoDich giaoDich);
    GiaoDich findById(Integer id);
}
