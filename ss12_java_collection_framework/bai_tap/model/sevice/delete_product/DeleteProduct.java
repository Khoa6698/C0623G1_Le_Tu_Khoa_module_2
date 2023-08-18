package ss12_java_collection_framework.bai_tap.model.sevice.delete_product;

import ss12_java_collection_framework.bai_tap.model.repository.IProductRepository;

public class DeleteProduct implements IDeleteProduct {
    private final IProductRepository iProductRepository;

    public DeleteProduct(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public boolean removeProduct(int id) {
        return iProductRepository.removeProduct(id);
    }
}
