package ss12_java_collection_framework.bai_tap.model.repository;

import ss12_java_collection_framework.bai_tap.model.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepositoryImpl implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    public void IProductRepositoryImpl() {
    }

    @Override
    public boolean removeProduct(int id) {
        return productList.removeIf(product -> Objects.equals(product.getId(), id));
    }

    @Override
    public boolean isExistProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return productList;
    }

    @Override
    public void save(Product product) {
        Product product1 = new Product(product.getId(), product.getName(), product.getPrice());
        productList.add(product1);
    }

    @Override
    public void setProduct(int id, Product product) {
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                product1.setName(product.getName());
            }
        }
    }
}
