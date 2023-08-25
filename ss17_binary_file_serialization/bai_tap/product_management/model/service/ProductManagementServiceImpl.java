package ss16_binary_file_serialization.bai_tap.product_management.model.service;

import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;
import ss16_binary_file_serialization.bai_tap.product_management.repository.IProductManagementRepository;
import ss16_binary_file_serialization.bai_tap.product_management.repository.ProductManagementRepositoryImpl;

import java.util.List;

public class ProductManagementServiceImpl implements IProductManagementService {
    private final IProductManagementRepository productManagementRepository = new ProductManagementRepositoryImpl();

    @Override
    public void addProduct(ProductManagement productManagement) {
        if (productManagement.getId()<0) {
            return;
        }
        this.productManagementRepository.addProduct(productManagement);
    }

    @Override
    public List<ProductManagement> getProduct() {
        return this.productManagementRepository.getProduct();
    }

    @Override
    public ProductManagement searchProductById(int id) {
        return this.productManagementRepository.searchProductById(id);
    }

}
