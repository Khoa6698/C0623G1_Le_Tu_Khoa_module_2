package case_study.model.entity.facility;

public class Villa extends Facility {
    private String roomStandardVilla;
    private int swimmingArea;
    private int numFloorsVilla;

    public Villa(String roomStandardVilla, int swimmingArea, int numFloorsVilla) {
        this.roomStandardVilla = roomStandardVilla;
        this.swimmingArea = swimmingArea;
        this.numFloorsVilla = numFloorsVilla;
    }

    public Villa(int id, String name, double area, double price, int limitPeopleAmount, String hireType, String roomStandardVilla, int swimmingArea, int numFloorsVilla) {
        super(id, name, area, price, limitPeopleAmount, hireType);
        this.roomStandardVilla = roomStandardVilla ;
        this.swimmingArea = swimmingArea;
        this.numFloorsVilla = numFloorsVilla;
    }

    public String getRoomStandardVilla() {
        return roomStandardVilla;
    }

    public void setRoomStandardVilla(String roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public int getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(int swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getNumFloorsVilla() {
        return numFloorsVilla;
    }

    public void setNumFloorsVilla(int numFloorsVilla) {
        this.numFloorsVilla = numFloorsVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard=" + roomStandardVilla +
                ", swimmingArea=" + swimmingArea +
                ", numFloors=" + numFloorsVilla +
                '}';
    }
}
