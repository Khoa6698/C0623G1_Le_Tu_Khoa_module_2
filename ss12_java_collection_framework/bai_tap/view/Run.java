package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.controller.ProductController;
import ss12_java_collection_framework.bai_tap.model.repositori.IProductRepository;
import ss12_java_collection_framework.bai_tap.model.repositori.IProductRepositoryImpl;
import ss12_java_collection_framework.bai_tap.model.sevice.delete_product.DeleteProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.delete_product.IDeleteProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.find_id.FindProductById;
import ss12_java_collection_framework.bai_tap.model.sevice.find_id.IFindProductById;
import ss12_java_collection_framework.bai_tap.model.sevice.find_name.FindByProductName;
import ss12_java_collection_framework.bai_tap.model.sevice.find_name.IFindByProductName;
import ss12_java_collection_framework.bai_tap.model.sevice.get_product.GetProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.get_product.IGetProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.save_product.ISaveProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.save_product.SaveProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.set_product.ISetProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.set_product.SetProduct;

import java.text.ParseException;

public class Run {
    public static void main(String[] args) {
        IProductRepository iProductRepository = new IProductRepositoryImpl();
        IGetProduct iGetProduct = new GetProduct(iProductRepository);
        ISaveProduct saveProduct = new SaveProduct(iProductRepository);
        ISetProduct setProduct = new SetProduct(iProductRepository);
        IDeleteProduct deleteProduct = new DeleteProduct(iProductRepository);
        IFindByProductName iFindByProductName = new FindByProductName(iProductRepository);
        IFindProductById iFindProductById = new FindProductById(iProductRepository);

        ProductController productController = new ProductController(
                deleteProduct,
                saveProduct,
                setProduct,
                iGetProduct,
                iFindByProductName,
                iFindProductById);
        ProductManager productManager = new ProductManager(productController);

        try {
            productManager.showsList();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
