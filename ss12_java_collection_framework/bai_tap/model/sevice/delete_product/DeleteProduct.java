package ss12_java_collection_framework.bai_tap.model.sevice.delete_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.sevice.get_product.GetProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.get_product.IGetProduct;

import java.util.List;
import java.util.Objects;

public class DeleteProduct implements IDeleteProduct {
    private final IGetProduct productList;

    public DeleteProduct(IGetProduct productList){this.productList = productList;}

    @Override
    public boolean removeProduct(int id) {
        List<Product> products = productList.getProducts();
        return products.removeIf(product -> Objects.equals(product.getId(), id));
    }
}
