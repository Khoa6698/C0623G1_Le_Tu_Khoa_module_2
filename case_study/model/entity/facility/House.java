package case_study.model.entity.facility;

public class House extends Facility {
    private String roomStandardHouse;
    private String numFloorsHouse;


    public House( String id, String name, String area, String price, String limitPeopleAmount, String hireType, String roomStandardHouse, String numFloorsHouse) {
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

    public String getNumFloorsHouse() {
        return numFloorsHouse;
    }

    public void setNumFloorsHouse(String     numFloorsHouse) {
        this.numFloorsHouse = numFloorsHouse;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "roomStandardHouse=" + roomStandardHouse +
                ", numFloorsHouse=" + numFloorsHouse +
                '}';
    }
}
