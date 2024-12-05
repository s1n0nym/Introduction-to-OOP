package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

class ProductTest {
    @Test
    void testProductInitialization() {
        Product product = new Product("Test Product", "Test Description", 19.99, 10);
        assertEquals("Test Product", product.getName());
        assertEquals("Test Description", product.getDescription());
        assertEquals(19.99, product.getPrice());
        assertEquals(10, product.getQuantity());
    }
}

class CategoryTest {
    @Test
    void testCategoryInitialization() {
        Category category = new Category("Test Category", "Test Description");
        assertEquals("Test Category", category.getName());
        assertEquals("Test Description", category.getDescription());
        assertNotNull(category.getProducts());
    }

    @Test
    void testUniqueProductCount() {
        Category category = new Category("Test Category", "Test Description");
        Product product1 = new Product("Product 1", "Description 1", 10.0, 5);
        Product product2 = new Product("Product 2", "Description 2", 20.0, 3);

        category.addProduct(product1);
        cate
        gory.addProduct(product2);

        assertEquals(2, Category.getTotalUniqueProducts());
    }

    @Test
    void testCategoryCount() {
        Category category1 = new Category("Category 1", "Description 1");
        Category category2 = new Category("Category 2", "Description 2");

        assertEquals(2, Category.getTotalCategories());
    }
}