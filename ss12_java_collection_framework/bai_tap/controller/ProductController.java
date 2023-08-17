package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.model.entity.Product;
import ss12_java_collection_framework.bai_tap.model.sevice.delete_product.IDeleteProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.find_id.IFindProductById;
import ss12_java_collection_framework.bai_tap.model.sevice.find_name.IFindByProductName;
import ss12_java_collection_framework.bai_tap.model.sevice.get_product.IGetProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.save_product.ISaveProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.set_product.ISetProduct;


import java.util.List;

public class ProductController {
    private final IDeleteProduct deleteProduct;
    private final ISaveProduct saveProduct;
    private final ISetProduct setProduct;
    private final IGetProduct getProduct;
    private final IFindByProductName iFindByProductName;
    private final IFindProductById findProductById;
    public ProductController(IDeleteProduct deleteProduct,
                             ISaveProduct saveProduct,
                             ISetProduct setProduct,
                             IGetProduct getProduct,
                             IFindByProductName iFindByProductName,
                             IFindProductById findProductById) {
        this.deleteProduct = deleteProduct;
        this.saveProduct = saveProduct;
        this.setProduct = setProduct;
        this.getProduct = getProduct;
        this.iFindByProductName = iFindByProductName;
        this.findProductById = findProductById;
    }

    public void addProduct(Product product) {
        saveProduct.save(product);
    }


    public void setProduct(int id , Product product) {
        setProduct.setProduct(id, product);
    }

    public boolean deleteProduct(int id) {
        return deleteProduct.removeProduct(id);
    }

    public List<Product> getProductList() {
        return getProduct.getProducts();
    }

    public Product findByProductName(String name) {
        return iFindByProductName.product(name);
    }

    public boolean findProductById(int id) {
        return findProductById.isExistProductById(id);
    }
}

