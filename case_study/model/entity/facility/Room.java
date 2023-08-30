package case_study.model.entity.facility;

public class Room extends Facility {
    private static int idRoom = 1000;
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, String area, String price, String limitPeopleAmount, String hireType, String freeService) {
        super(id, name, area, price, limitPeopleAmount, hireType);
        idRoom++;
        this.setId("SVRO-"+idRoom);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}
