package edu.mum.service;

import edu.mum.domain.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAll();

    public void save(Product product);


}
 
