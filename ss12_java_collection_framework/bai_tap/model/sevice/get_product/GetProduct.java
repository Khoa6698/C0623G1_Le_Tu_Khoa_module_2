package ss12_java_collection_framework.bai_tap.model.sevice.get_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repository.IProductRepository;

import java.util.List;

public class GetProduct implements IGetProduct {

    private final IProductRepository iProductRepository;

    public GetProduct(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public List<Product> getProducts() {
        return iProductRepository.getProducts();
    }
}
