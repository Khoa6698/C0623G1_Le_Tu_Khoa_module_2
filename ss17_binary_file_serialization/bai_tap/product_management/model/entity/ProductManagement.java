package ss16_binary_file_serialization.bai_tap.product_management.model.entity;

public class ProductManagement {
    private int id;
    private String name;
    private String price;
    private String manufacturers;
    private String describe;

    public ProductManagement(){}

    public ProductManagement(int id, String name, String price, String manufacturers, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturers = manufacturers;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", manufacturers='" + manufacturers + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
