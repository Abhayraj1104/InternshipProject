package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Brand;
import com.example.entity.Category;
import com.example.entity.Product;
import com.example.entity.SubCategory;
import com.example.repository.BrandRepository;
import com.example.repository.CategoryRepository;
import com.example.repository.ProductRepository;
import com.example.repository.SubCategoryRepository;
import com.example.service.ProductUpdateService;

@Service
public class ProductUpdateServiceImple implements ProductUpdateService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Product updateData(Product product, Long id) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setProductName(product.getProductName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setStock(product.getStock());

            if (product.getCategory() != null && product.getCategory().getCategoryId() != null) {
                Category category = categoryRepository.findById(product.getCategory().getCategoryId()).orElse(null);
                existingProduct.setCategory(category);
            }

            if (product.getSubCategory() != null && product.getSubCategory().getSubCategoryId() != null) {
                SubCategory subCategory = subCategoryRepository.findById(product.getSubCategory().getSubCategoryId()).orElse(null);
                existingProduct.setSubCategory(subCategory);
            }

            if (product.getBrand() != null && product.getBrand().getBrandId() != null) {
                Brand brand = brandRepository.findById(product.getBrand().getBrandId()).orElse(null);
                existingProduct.setBrand(brand);
            }

            return productRepository.save(existingProduct);
        }
        return null;
    }
}
