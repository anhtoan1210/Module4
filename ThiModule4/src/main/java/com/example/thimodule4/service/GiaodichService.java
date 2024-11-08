package com.example.thimodule4.service;

import com.example.thimodule4.model.Giaodich;
import com.example.thimodule4.repository.IGiaodichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GiaodichService implements IGiaodichService {
    @Autowired
    private IGiaodichRepository giaodichRepository;
    @Override
    public Page<Giaodich> search(Pageable pageable, String name, Integer khachhang) {
        if (name != null && khachhang != null){
            return giaodichRepository.searchNameAndKhachhang(pageable, name, khachhang);
        }else if (name!=null){
            return giaodichRepository.searchName(pageable,name);
        }else if (khachhang!= null){
            return giaodichRepository.searchKhachhang(pageable,khachhang);
        }else {
            return giaodichRepository.findAll(pageable);
        }
    }

    @Override
    public Page<Giaodich> hienThi(Pageable pageable) {
        return giaodichRepository.findAll(pageable);
    }

    @Override
    public void themMoi(Giaodich giaodich) {
        giaodichRepository.save(giaodich);
    }
}
