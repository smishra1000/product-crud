package com.sameer.productcrud.controller;

import com.sameer.productcrud.model.Product;
import com.sameer.productcrud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
private ProductService productService;

 @GetMapping("/getproductlist")
 @CrossOrigin(origins = "http://localhost:4200")
 public List<Product> fetchProductList(){
    List<Product> products = new ArrayList<Product>();
    products = productService.fetchProductList();
    return products;
 }

 @PostMapping("/addproduct")
 @CrossOrigin(origins = "http://localhost:4200")
 public Product saveProduct(@RequestBody Product product){
     return productService.saveProduct(product);
 }

    @GetMapping("/getproductbyid/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Product fetchProductById(@PathVariable int id){
        return productService.fetchProductById(id).get();
    }

    @DeleteMapping("/deleteproduct/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String deleteProductById(@PathVariable int id){
        return productService.deleteProductById(id);
    }
}
