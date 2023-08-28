package case_study.model.entity.facility;

public abstract class Facility {
    private int id;
    private String name;
    private double area;
    private double price;
    private int limitPeopleAmount;
    private String hireType;

    public Facility(){}

    public Facility(int id, String name, double area, double price, int limitPeopleAmount, String hireType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.limitPeopleAmount = limitPeopleAmount;
        this.hireType = hireType;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLimitPeopleAmount() {
        return limitPeopleAmount;
    }

    public void setLimitPeopleAmount(int limitPeopleAmount) {
        this.limitPeopleAmount = limitPeopleAmount;
    }

    public String getHireType() {
        return hireType;
    }

    public void setHireType(String hireType) {
        this.hireType = hireType;
    }

    @Override
    public String toString() {
        return "FuramaService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", limitPeopleAmount=" + limitPeopleAmount +
                ", hireType='" + hireType + '\'' +
                '}';
    }
}
