package com.varun.sweets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.sweets.entity.Category;
import com.varun.sweets.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @SuppressWarnings("null")
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void removeCategoryById(int id) {
        categoryRepository.deleteById(id);
    }

    public Optional<Category> getCategoryById(int id) {
        return categoryRepository.findById(id);
    }
}
