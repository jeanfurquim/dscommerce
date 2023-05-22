package com.jpisistemas.dscommerce.repositories;

import com.jpisistemas.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
