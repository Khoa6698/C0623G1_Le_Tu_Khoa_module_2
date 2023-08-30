package case_study.model.entity.facility;

public class Villa extends Facility {
    private static int idVilla = 1000;
    private String roomStandardVilla;
    private String swimmingArea;
    private String numFloorsVilla;



    public Villa(String roomStandardVilla, String swimmingArea, String numFloorsVilla, String string, String s, String string1, String s1) {
        this.roomStandardVilla = roomStandardVilla;
        this.swimmingArea = swimmingArea;
        this.numFloorsVilla = numFloorsVilla;
    }

    public Villa(String id, String name, String area, String price, String limitPeopleAmount, String hireType, String roomStandardVilla, String swimmingArea, String numFloorsVilla) {
        super(id, name, area, price, limitPeopleAmount, hireType);
        idVilla++;
        this.setId("SVVL-"+idVilla);
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

    public String getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(String swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public String getNumFloorsVilla() {
        return numFloorsVilla;
    }

    public void setNumFloorsVilla(String numFloorsVilla) {
        this.numFloorsVilla = numFloorsVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandard=" + roomStandardVilla +
                ", swimmingArea=" + swimmingArea +
                ", numFloors=" + numFloorsVilla +
                '}';
    }
}
