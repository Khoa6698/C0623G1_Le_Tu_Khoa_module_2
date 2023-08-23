package ss16_binary_file_serialization.bai_tap.product_management.model.service;

import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;

import java.util.List;

public interface IProductManagementService {
    void addProduct(ProductManagement productManagement);

    List<ProductManagement> getProduct();

    ProductManagement searchProductById(int id);

}
