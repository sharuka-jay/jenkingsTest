package com.sheryians.major.service;

import com.sheryians.major.model.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.repository.CategoryRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

//Category service
@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category>getAllCategory(){
        return categoryRepository.findAll();
    }

    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    public void removeCategoryById(int id){
        categoryRepository.deleteById(id);
    }

    public java.util.Optional<Category> getCategoryById(int id){
        return categoryRepository.findById(id);
    }
}
