package edu.mum.repository;

import edu.mum.domain.Product;

import java.util.List;

public interface ProductRepository {


    public List<Product> getAll();

    public void save(Product product);

}
 
