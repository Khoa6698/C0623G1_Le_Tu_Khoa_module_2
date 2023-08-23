package ss16_binary_file_serialization.bai_tap.product_management.view;

import ss16_binary_file_serialization.bai_tap.product_management.controller.ProductManagementController;
import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductManagementController productManagementController = new ProductManagementController();

    public void displayManu() {
        System.out.println("====PRODUCT MANAGEMENT====");
        System.out.println("  1. Nhập sản phẩm mới");
        System.out.println("  2. Xem tất cả sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm theo id");
        System.out.println("Chọn số theo tường phuơng thức: ");
        System.out.println("==============================");
    }

    public void render() {
        int k = 0;
        boolean b = true;
        while (b) {
            int option;
            do {
                displayManu();
                option = Integer.parseInt(scanner.nextLine());
            } while (option <= 0 && option > 3);

            switch (option) {
                case 1:
                    ProductManagement newProduct = inputProduc();
                    this.productManagementController.addProduct(newProduct);
                    break;
                case 2:
                    List<ProductManagement> productManagements = this.productManagementController.getProduct();
                    for (ProductManagement p : productManagements) {
                        System.out.println("ProductManagement{" +
                                " id= " + p.getId() +
                                ", name= " + p.getName() +
                                ", price= " + p.getPrice() +
                                ", manufacturers= " + p.getManufacturers() +
                                ", describe= " + p.getDescribe() +
                                "}");
                    }
                    break;
                case 3:
                    searchById();
                    break;
            }
            k++;
            b = k < Integer.MAX_VALUE;
        }
    }

    private ProductManagement inputProduc() {
        ProductManagement productManagement = new ProductManagement();

        System.out.println("Nhập tên sản phẩm");
        productManagement.setName(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm");
        productManagement.setPrice(scanner.nextLine());
        System.out.println("Nhập hãng sản phẩm");
        productManagement.setManufacturers(scanner.nextLine());
        System.out.println("Mô tả sản phẩm");
        productManagement.setDescribe(scanner.nextLine());
        return productManagement;
    }

    private void searchById() {
        System.out.println("Nhap san pham muon tim kiem theo id: ");
        int id = Integer.parseInt(scanner.nextLine());
        List<ProductManagement> listProduct = new ArrayList<>();
        listProduct.add(productManagementController.searchProductById(id));
        if (listProduct != null) {
            for (ProductManagement p : listProduct) {
                System.out.println(p);
            }
        } else {

            System.out.println("không tìm thấy đối tượng");
        }
    }
}
