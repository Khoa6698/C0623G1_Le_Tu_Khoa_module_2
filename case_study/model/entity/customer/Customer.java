package case_study.model.entity.customer;

public class Customer {
    private String id;
    private String name;
    private String birthDay;
    private String sex;
    private String identityCard;
    private String phone;
    private String email;
    private String customerType;
    private String address;

    public Customer(){}
    public Customer(String id, String name, String birthDay,
                    String sex, String identityCard,
                    String phone, String email,
                    String customerType, String address) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex=" + sex +
                ", identityCard='" + identityCard + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
