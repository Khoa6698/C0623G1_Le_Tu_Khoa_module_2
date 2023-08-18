package ss12_java_collection_framework.bai_tap.model.sevice.find_id;

import ss12_java_collection_framework.bai_tap.model.repository.IProductRepository;

public class FindProductById implements IFindProductById{
    private final IProductRepository iProductRepository;

    public FindProductById(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    public boolean isExistProductById(int id) {
        return iProductRepository.isExistProductById(id);
    }
}
