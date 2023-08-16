package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.controller.ProductController;
import ss12_java_collection_framework.bai_tap.model.sevice.delete_product.DeleteProduct;
import ss12_java_collection_framework.bai_tap.model.sevice.delete_product.IDeleteProduct;
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
        IGetProduct iGetProduct = new GetProduct();
        ISaveProduct saveProduct = new SaveProduct();
        ISetProduct setProduct = new SetProduct(iGetProduct);
        IDeleteProduct deleteProduct = new DeleteProduct(iGetProduct);
        IFindByProductName iFindByProductName = new FindByProductName();

        ProductController productController = new ProductController(deleteProduct,
                saveProduct,
                setProduct,
                iGetProduct, iFindByProductName);
        ProductManager productManager= new ProductManager(productController);
        try {
            productManager.showsList();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
