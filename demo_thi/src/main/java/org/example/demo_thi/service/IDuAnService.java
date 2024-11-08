package org.example.demo_thi.service;

import org.example.demo_thi.model.DuAn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDuAnService {
    Page<DuAn> finAll(Pageable pageable);
    Page<DuAn> findByName(Pageable pageable,String name);

    void save(DuAn duAn);
}
