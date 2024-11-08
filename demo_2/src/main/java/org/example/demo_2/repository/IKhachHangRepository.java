package org.example.demo_2.repository;

import org.example.demo_2.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKhachHangRepository extends JpaRepository<KhachHang,Integer> {

//    KhachHang findKhachHangByTenKhachHang (String name);

}
