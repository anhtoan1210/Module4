package org.example.demo_2.service;

import org.example.demo_2.model.KhachHang;
import org.example.demo_2.repository.IKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangService implements IKhachHangService{
@Autowired
    IKhachHangRepository khachHangRepository;
@Override
    public List<KhachHang> fiAll() {
        return khachHangRepository.findAll();
    }

//    @Override
//    public KhachHang findByName(String name) {
//        return khachHangRepository.findKhachHangByTenKhachHang(name);
//    }
//
//    @Override
//    public KhachHang createKhachHang(KhachHang khachHang) {
//        return khachHangRepository.save(khachHang);
//    }
}
