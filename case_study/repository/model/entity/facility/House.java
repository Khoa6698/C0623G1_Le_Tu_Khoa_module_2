package case_study.model.entity.facility;

public class House extends Facility {
    private String roomStandardHouse;
    private int numFloorsHouse;

    public House(String roomStandardHouse, int numFloorsHouse) {
        this.roomStandardHouse = roomStandardHouse;
        this.numFloorsHouse = numFloorsHouse;
    }

    public House(int id, String name, double area, double price, int limitPeopleAmount, String hireType, String roomStandardHouse, int numFloorsHouse) {
        super(id, name, area, price, limitPeopleAmount, hireType);
        this.roomStandardHouse = roomStandardHouse;
        this.numFloorsHouse = numFloorsHouse;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public int getNumFloorsHouse() {
        return numFloorsHouse;
    }

    public void setNumFloorsHouse(int numFloorsHouse) {
        this.numFloorsHouse = numFloorsHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandardHouse=" + roomStandardHouse +
                ", numFloorsHouse=" + numFloorsHouse +
                '}';
    }
}
