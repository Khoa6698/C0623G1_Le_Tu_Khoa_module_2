package ss12_java_collection_framework.bai_tap.model.sevice.get_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repositori.DbForSaveProduct;

import java.util.List;

public class GetProduct implements IGetProduct {

    @Override
    public List<Product> getProducts() {
        return DbForSaveProduct.productList;
    }
}
