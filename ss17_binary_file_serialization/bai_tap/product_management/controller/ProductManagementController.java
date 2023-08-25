package ss16_binary_file_serialization.bai_tap.product_management.controller;

import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;
import ss16_binary_file_serialization.bai_tap.product_management.model.service.IProductManagementService;
import ss16_binary_file_serialization.bai_tap.product_management.model.service.ProductManagementServiceImpl;

import java.util.List;

public class ProductManagementController {
    private final IProductManagementService productManagementService = new ProductManagementServiceImpl();
    public void addProduct(ProductManagement productManagement){
        this.productManagementService.addProduct(productManagement);
    }
    public List<ProductManagement> getProduct(){
        return  this.productManagementService.getProduct();
    }
    public ProductManagement searchProductById(int id){
        return this.productManagementService.searchProductById(id);
    }
}
