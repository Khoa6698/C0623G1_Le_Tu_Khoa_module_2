package ss12_java_collection_framework.bai_tap.model.sevice.find_name;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.repositori.IProductRepository;

public class FindByProductName implements IFindByProductName{
    private final IProductRepository iProductRepository;

    public FindByProductName(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public Product product(String name) {
        return iProductRepository.getProductByName(name);
    }
}
