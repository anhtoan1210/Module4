package org.example.bai_tap_ss4_bai_1.service;

import org.example.bai_tap_ss4_bai_1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    boolean add(Product product);

    void remove(Product product);

    void update(Product product);

    Product getById(int id);

    int findIndex(int id);

    List<Product> searchByName(String nameSearch);

}