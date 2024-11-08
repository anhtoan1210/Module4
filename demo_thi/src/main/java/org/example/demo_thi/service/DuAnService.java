package org.example.demo_thi.service;

import org.example.demo_thi.model.DuAn;
import org.example.demo_thi.repository.IDuAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DuAnService implements IDuAnService {
    @Autowired
    private IDuAnRepository duAnRepository;

    @Override
    public Page<DuAn> finAll(Pageable pageable) {
        return duAnRepository.findAll(pageable);
    }

    @Override
    public Page<DuAn> findByName(Pageable pageable, String name) {
        return duAnRepository.findDuAnByTenDuAnContaining(pageable, name);
    }

    @Override
    public void save(DuAn duAn) {
        duAnRepository.save(duAn);
    }
}
