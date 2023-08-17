package ss12_java_collection_framework.bai_tap.model.sevice.set_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repositori.IProductRepository;

public class SetProduct implements ISetProduct {

    private final IProductRepository iProductRepository;

    public SetProduct(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public void setProduct(int id, Product product) {
        iProductRepository.setProduct(id, product);
    }
}

