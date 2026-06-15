package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Product;
import com.example.service.ProductCreateService;
import com.example.service.ProductDeleteService;
import com.example.service.ProductFetchAllService;
import com.example.service.ProductFetchService;
import com.example.service.ProductUpdateService;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductCreateService productCreateService;

    @Autowired
    private ProductDeleteService productDeleteService;

    @Autowired
    private ProductUpdateService productUpdateService;

    @Autowired
    private ProductFetchService productFetchService;

    @Autowired
    private ProductFetchAllService productFetchAllService;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productCreateService.addData(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Product> fetchAllProduct() {
        return productFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Product fetchProduct(@PathVariable Long id) {
        return productFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product,
                                 @PathVariable Long id) {
        return productUpdateService.updateData(product, id);
    }
}
