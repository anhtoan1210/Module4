package com.example.demo.service;

import com.example.demo.model.TinTuc;
import com.example.demo.repository.ITinTucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class tinTucService implements ITinTucService{
    @Autowired
    ITinTucRepository iTinTucRepository;
    @Override
    public Page<TinTuc> hienThi(Pageable pageable) {
        return iTinTucRepository.findAll(pageable);
    }

    @Override
    public void themMoi(TinTuc tinTuc) {
        iTinTucRepository.save(tinTuc);

    }

    @Override
    public void Xoa(Long id) {
        iTinTucRepository.deleteById(id);

    }

    @Override
    public Page<TinTuc> search(Pageable pageable,String name,Integer danhMuc) {
        if (name != null && danhMuc != null){
            return iTinTucRepository.searchTenAndDanhMuc(pageable, name, danhMuc);
        }else if (name!=null){
            return iTinTucRepository.searchName(pageable,name);
        }else if (danhMuc!= null){
            return iTinTucRepository.searchDanhMuc(pageable,danhMuc);
        }else {
            return iTinTucRepository.findAll(pageable);
        }

    }

    @Override
    public TinTuc selecter(Long id) {
        return iTinTucRepository.findById(id).orElse(null);
    }

}
