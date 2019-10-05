package edu.mum.service;

import edu.mum.domain.Category;

import java.util.List;

public interface CategoryService {
    public Category getCategory(int id);

    public List<Category> getAll();
}
 
