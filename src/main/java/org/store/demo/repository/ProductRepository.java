package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.domain.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
