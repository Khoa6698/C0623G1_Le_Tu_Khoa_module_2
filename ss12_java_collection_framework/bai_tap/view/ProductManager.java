package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.controller.ProductController;
import ss12_java_collection_framework.bai_tap.model.entity.Product;
import java.text.ParseException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final Scanner scanner = new Scanner(System.in);
    private final ProductController controller;


    public ProductManager(ProductController controller) {
        this.controller = controller;
    }


    public void showsList() throws ParseException {
        int k = 0;
        boolean b = true;
        while (b) {
            System.out.println("-------------------------------------");
            System.out.println("------Chương trình quản lý sản-------");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("---1.Thêm sản phẩm:------------------");
            System.out.println("---2.Sửa thông tin sản phẩm theo id---");
            System.out.println("---3.Xoá sản phẩm theo id------------");
            System.out.println("---4.Hiển thị danh sách sản phẩm-----");
            System.out.println("---5.Tìm sản phẩm theo tên -----");
            System.out.println("---6.Sắp xếp theo giá -----");
            System.out.println("Chọn chức năng:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> editProductById();
                case 3 -> removeProduct();
                case 4 -> displayProduct();
                case 5 -> findByProductName();
                case 6 -> sortProductByPrice();
                default -> System.out.println("Invalid choice. Please select again.");
            }
            k++;
            b = k < Integer.MAX_VALUE;
        }
    }

    private void addProduct() throws ParseException {
        System.out.println("Thông tin sản phẩm: ");
        controller.addProduct(product());
    }

    private Product product() throws ParseException {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Product(id, name, price);
    }

    private Product removeProduct() throws ParseException {
        System.out.println("Nhâp mã muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (isExistProductById(id)) {
            System.out.println("1. Yes");
            System.out.println("2. No");
            int type = scanner.nextInt();
            scanner.nextLine();
            if (type == 1) {
                controller.deleteProduct(id);
            } else if (type == 2) {
                showsList();
            }
        } else {
            System.out.println("Mã sản phẩm không đúng: ");
            showsList();
        }
        return null;
    }

    private void displayProduct() {
        List<Product> productList = controller.getProductList();
        System.out.println("-----------------------------");
        System.out.println("Danh sách sản phẩm: ");

        for (Product product : productList) {
            System.out.println("id: " + product.getId());
            System.out.println("name = " + product.getName());
            System.out.println("price = " + product.getPrice());
            System.out.println("------------------------------");
        }
    }

    private void editProductById() throws ParseException {
        System.out.println("Nhập id muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm mới: ");
        String name = scanner.nextLine();
        Product product = new Product(id, name);
        controller.setProduct(id, product);
    }

    private void findByProductName() {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        Product product = controller.findByProductName(name);
        System.out.println("------------------------------");
        System.out.println("id: " + product.getId());
        System.out.println("name = " + product.getName());
        System.out.println("price = " + product.getPrice());
    }

    private void sortProductByPrice() {
        List<Product> productList = controller.getProductList();
        System.out.println("1. Tăng dần");
        System.out.println("2. Giảm dần");
        int type = Integer.parseInt(scanner.nextLine());
        if (type == 1) {
            productList.sort((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
            for (Product product : productList) {
                System.out.println("id: " + product.getId());
                System.out.println("name = " + product.getName());
                System.out.println("price = " + product.getPrice());
                System.out.println("------------------------------");
            }
        } else {
                productList.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
            });
            for (Product product : productList){
                System.out.println("id: "+ product.getId());
                System.out.println("name = "+product.getName());
                System.out.println("price = "+product.getPrice());
                System.out.println("------------------------------");
            }
        }
    }

    private boolean isExistProductById(int id) {
        List<Product> products = controller.getProductList();

        for (Product product : products) {
            if (product.getId() == id) {
                return true;
            }
        }

        return false;
    }
}
