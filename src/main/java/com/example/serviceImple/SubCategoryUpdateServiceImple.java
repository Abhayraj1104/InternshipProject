package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.entity.SubCategory;
import com.example.repository.CategoryRepository;
import com.example.repository.SubCategoryRepository;
import com.example.service.SubCategoryUpdateService;

@Service
public class SubCategoryUpdateServiceImple implements SubCategoryUpdateService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public SubCategory updateData(SubCategory subCategory, Long id) {

        SubCategory existingSubCategory = subCategoryRepository.findById(id).orElse(null);

        if (existingSubCategory != null) {
            existingSubCategory.setSubCategoryName(subCategory.getSubCategoryName());

            if (subCategory.getCategory() != null && subCategory.getCategory().getCategoryId() != null) {
                Category category = categoryRepository.findById(subCategory.getCategory().getCategoryId()).orElse(null);
                existingSubCategory.setCategory(category);
            }

            return subCategoryRepository.save(existingSubCategory);
        }

        return null;
    }
}
