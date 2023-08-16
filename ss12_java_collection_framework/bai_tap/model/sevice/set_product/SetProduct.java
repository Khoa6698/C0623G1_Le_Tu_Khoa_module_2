package ss12_java_collection_framework.bai_tap.model.sevice.set_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repositori.DbForSaveProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.get_product.IGetProduct;

import java.util.List;

public class SetProduct implements ISetProduct {

    IGetProduct iGetProduct;

    public SetProduct(IGetProduct iGetProduct) {
        this.iGetProduct = iGetProduct;
    }

    @Override
    public void setProduct(int id, Product product) {
        List<Product> productList = iGetProduct.getProducts();
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                product1.setName(product.getName());
            }
        }
    }
}

