package com.example.thimodule4.service;

import com.example.thimodule4.model.Giaodich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGiaodichService {
    Page<Giaodich> search(Pageable pageable, String name, Integer khachhang);

    Page<Giaodich> hienThi(Pageable pageable);

    void themMoi(Giaodich giaodich);
}
