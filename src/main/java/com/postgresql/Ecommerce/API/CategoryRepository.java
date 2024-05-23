package com.postgresql.Ecommerce.API;

import com.postgresql.Ecommerce.API.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}