package case_study.model.entity.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(int id, String name, double area, double price, int limitPeopleAmount, String hireType, String freeService) {
        super(id, name, area, price, limitPeopleAmount, hireType);
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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
