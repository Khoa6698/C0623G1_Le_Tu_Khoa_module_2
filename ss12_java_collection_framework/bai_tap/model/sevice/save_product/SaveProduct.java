package ss12_java_collection_framework.bai_tap.model.sevice.save_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repositori.DbForSaveProduct;

public class SaveProduct implements ISaveProduct {


    @Override
    public void save(Product product) {
        Product product1 = new Product(product.getId(), product.getName(), product.getPrice());
        DbForSaveProduct.productList.add(product1);
    }
}
