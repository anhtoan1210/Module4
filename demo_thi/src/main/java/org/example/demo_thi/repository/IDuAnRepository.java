package org.example.demo_thi.repository;

import org.example.demo_thi.model.DuAn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDuAnRepository extends JpaRepository<DuAn, Integer> {
    Page<DuAn> findDuAnByTenDuAnContaining(Pageable pageable, String name);
}
