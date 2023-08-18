package ss12_java_collection_framework.bai_tap.model.sevice.save_product;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repository.IProductRepository;

public class SaveProduct implements ISaveProduct {

    private final IProductRepository iProductRepository;

    public SaveProduct(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }
}
