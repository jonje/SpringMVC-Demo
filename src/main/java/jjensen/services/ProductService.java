package jjensen.services;

import jjensen.domain.Product;

import java.util.List;

/**
 * Created by jpjense3 on 1/15/2016.
 */
public interface ProductService {
    List<Product> listAllProducts();
    Product getProductById(Integer id);
    Product saveOrUpdateProduct(Product product);
    void deleteProduct(Integer id);
}
