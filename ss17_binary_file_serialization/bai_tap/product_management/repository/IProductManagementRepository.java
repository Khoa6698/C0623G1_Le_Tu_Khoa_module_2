package ss16_binary_file_serialization.bai_tap.product_management.repository;

import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;

import java.util.List;

public interface IProductManagementRepository {
    void addProduct(ProductManagement productManagement);

    List<ProductManagement> getProduct();

    ProductManagement searchProductById(int id);
}
