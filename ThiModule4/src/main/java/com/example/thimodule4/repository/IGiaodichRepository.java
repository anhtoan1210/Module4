package com.example.thimodule4.repository;

import com.example.thimodule4.model.Giaodich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IGiaodichRepository extends JpaRepository<Giaodich, Long> {
    Page<Giaodich> findAll(Pageable pageable);
    @Query("select p from Giaodich p where p.maGiaoDich like %?1% and p.khachhang.id = ?2")
    Page<Giaodich> searchNameAndKhachhang(Pageable pageable, String name, Integer khachhang);
    @Query("select p from Giaodich p where p.maGiaoDich like %?1%")
    Page<Giaodich> searchName(Pageable pageable, String name);
    @Query("select p from Giaodich p where  p.khachhang.id = ?1")
    Page<Giaodich> searchKhachhang(Pageable pageable, Integer khachhang);
}
