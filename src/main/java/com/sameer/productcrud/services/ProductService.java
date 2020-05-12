package com.sameer.productcrud.services;

import com.sameer.productcrud.model.Product;
import com.sameer.productcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> fetchProductList() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional <Product> fetchProductById(int id) {
        return productRepository.findById(id);
    }

    public String deleteProductById(int id) {
        String result;
        try{
            productRepository.deleteById(id);
            result = "product with id is successfully deleted";

        }catch(Exception e) {
            result = "product with id is not deleted";
        }
        return result;
    }
}
