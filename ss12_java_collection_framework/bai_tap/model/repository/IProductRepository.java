package ss12_java_collection_framework.bai_tap.model.repository;

import ss12_java_collection_framework.bai_tap.model.entity.Product;

import java.util.List;

public interface IProductRepository {
    boolean removeProduct(int id);
    boolean isExistProductById(int id);
    Product getProductByName(String name);
    List<Product> getProducts();
    void save(Product product);
    void setProduct(int id, Product product);
}
