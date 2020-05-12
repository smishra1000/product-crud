package com.sameer.productcrud.repository;

import com.sameer.productcrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
}
