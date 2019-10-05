package edu.mum.repository;

import edu.mum.domain.Category;

import java.util.List;

public interface CategoryRepository {


    public Category getCategory(int id);

    public List<Category> getAll();


}
 
