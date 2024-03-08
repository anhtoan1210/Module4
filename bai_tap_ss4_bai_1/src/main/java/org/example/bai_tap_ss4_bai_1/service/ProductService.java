package org.example.bai_tap_ss4_bai_1.service;

import org.example.bai_tap_ss4_bai_1.model.Product;
import org.example.bai_tap_ss4_bai_1.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public void remove(Product product) {
        productRepository.remove(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public List<Product> searchByName(String nameSearch) {
        return productRepository.searchByName(nameSearch);
    }

    @Override
    public Product getById(int id) {
        return productRepository.getById(id);
    }

    @Override
    public int findIndex(int id) {
        return productRepository.findIndex(id);
    }
}