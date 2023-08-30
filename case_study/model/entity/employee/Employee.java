package case_study.model.entity.employee;

public class Employee {
    private String idStaff;
    private String nameStaff;
    private String birthDay;
    private String sex;
    private String identityCard;
    private String phone;
    private String email;
    private String levelType;
    private String positionType;
    private double salary;

    public Employee(){}

    public Employee(String idStaff, String nameStaff, String birthDay, String sex, String identityCard, String phone, String email, String levelType, String positionType, double salary) {
        this.idStaff = idStaff;
        this.nameStaff = nameStaff;
        this.birthDay = birthDay;
        this.sex = sex;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
        this.levelType = levelType;
        this.positionType = positionType;
        this.salary = salary;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
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

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + idStaff + '\'' +
                ", staffName='" + nameStaff + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex=" + sex +
                ", identityCard='" + identityCard + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", levelType='" + levelType + '\'' +
                ", positionType='" + positionType + '\'' +
                ", salary=" + salary +
                '}';
    }
}
