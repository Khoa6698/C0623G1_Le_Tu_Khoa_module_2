package ss12_java_collection_framework.bai_tap.model.sevice.find_name;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repositori.DbForSaveProduct;

import java.util.List;

public class FindByProductName implements IFindByProductName{
    @Override
    public Product product(String name) {
        List<Product> products = DbForSaveProduct.productList;

        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
