package ss16_binary_file_serialization.bai_tap.product_management.repository;

import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;
import ss16_binary_file_serialization.bai_tap.product_management.utils.ReaderAndWriter;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementRepositoryImpl implements IProductManagementRepository {
    private static final String FILE_PATH = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\ss16_binary_file_serialization\\bai_tap\\product_management\\data\\list.csv";
    private static final String COMMA =",";
    @Override
    public void addProduct(ProductManagement productManagement) {
        List<ProductManagement> stringList  = this.getProduct();
        productManagement.setId(stringList.size()+1);
        stringList.add(productManagement);
        List<String> strings = this.convertToString(stringList);
        ReaderAndWriter.writer(FILE_PATH,strings);
    }

    @Override
    public List<ProductManagement> getProduct() {
        List<String> list = ReaderAndWriter.reader(FILE_PATH);
        List<ProductManagement> productManagements1 = new ArrayList<>();
        String array[] = null;
        for (String p : list){
            array = p.split(",");
            productManagements1.add(new ProductManagement(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4]));
        }
        return productManagements1;
    }

    @Override
    public ProductManagement searchProductById(int id) {
        List<ProductManagement> result =  this.getProduct();
        for (ProductManagement p : result){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    private List<String> convertToString(List<ProductManagement> productManagements){
        List<String> strings = new ArrayList<>();
        for (ProductManagement p : productManagements){
            strings.add(p.getId()+COMMA+p.getName()+COMMA
                    +p.getPrice()+COMMA+p.getManufacturers()
                    +COMMA+p.getDescribe());

        }
        return strings;
    }
}
