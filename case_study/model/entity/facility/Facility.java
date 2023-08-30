package case_study.model.entity.facility;

public abstract class Facility {
    private String id;
    private String name;
    private String area;
    private String price;
    private String limitPeopleAmount;
    private String hireType;

    public Facility(){}

    public Facility( String id, String name, String area, String price, String limitPeopleAmount, String hireType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.limitPeopleAmount = limitPeopleAmount;
        this.hireType = hireType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLimitPeopleAmount() {
        return limitPeopleAmount;
    }

    public void setLimitPeopleAmount(String limitPeopleAmount) {
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
