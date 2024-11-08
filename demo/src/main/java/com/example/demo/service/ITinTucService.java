package com.example.demo.service;

import com.example.demo.model.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITinTucService {
    Page<TinTuc> hienThi(Pageable pageable);

    void themMoi(TinTuc tinTuc);

    void Xoa(Long id);

    Page<TinTuc> search(Pageable pageable, String name, Integer danhMuc);

    TinTuc selecter(Long id);
}
