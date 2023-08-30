package case_study.view.menu;

import case_study.controller.FacilityController;
import case_study.model.entity.facility.Facility;
import case_study.model.entity.facility.House;
import case_study.model.entity.facility.Room;
import case_study.model.entity.facility.Villa;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class FacilityMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final Regex  regex = new Regex();
    private final FacilityController facilityController = new FacilityController();

    public void facilityRender() {
        int optionFacility;
        do {
            facilityManagement();
            optionFacility = Integer.parseInt(scanner.nextLine());
            switch (optionFacility) {
                case 1:
                    displayListFacility(this.facilityController.getList());
                    break;
                case 2:
                    this.facilityController.add(inputOptionFacility());
                    System.out.println("Successfully added new");
                    break;
                case 3:
                    List<Facility> facilityList = facilityController.displayMaintenanceFacility();
                    if(facilityList.isEmpty()){
                        System.out.println("The room is still satisfactory");
                    }else {
                        for (Facility f : facilityList){
                            System.out.println(f);
                        }
                    }
                    break;
                case 4:
                    this.facilityController.delete(inputIdFacility());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Goodbye!");

            }
        } while (optionFacility != 5);
    }

    public void facilityManagement() {
        System.out.println("===Facility Management===");
        System.out.println("1 Display list facility");
        System.out.println("2 Add new facility");
        System.out.println("3 Display list facility maintenance");
        System.out.println("4 Delete facility");
        System.out.println("5 Return main menu");
        System.out.println("----------------------------");
        System.out.println("Select method by number: ");
    }

    public Facility inputOptionFacility(){
        Facility facility = new Facility() {
        };

        int option;
        do {
            System.out.println("Select the type of service according to: ");
            System.out.println("1. Villa (SVLV)");
            System.out.println("2. House (SVHO)");
            System.out.println("3. Room (SVRO)");
            option = Integer.parseInt(scanner.nextLine());
            if (option<=0||option>3){
                System.out.println("Your selection is not valid!");
            }
        }while (option<=0||option>3);
        String name;
        do {
            System.out.println("Enter name ? (VD: House)");
            name = scanner.next();
        }while (!Regex.CheckNameEmployee(name));
        facility.setName(name);
        String area;
        do {
            System.out.println("Enter room size");
            area = scanner.nextLine();
        }while (!Regex.checkArea(area));
        facility.setArea(area);
        String price;
        do {
            System.out.println("Enter rental price");
            price = scanner.nextLine();
        }while (!Regex.checkPrice(price));
        facility.setPrice(price);
        String limitPeopleAmount;
        do {
            System.out.println("Enter the number of people");
            limitPeopleAmount = scanner.nextLine();
        }while (!Regex.checkLimitPeopleAmount(limitPeopleAmount));
        facility.setLimitPeopleAmount(limitPeopleAmount);

            System.out.println("Enter your rental period: ");
        System.out.println("1. By Year");
        System.out.println("2. By Monthly");
        System.out.println("3. By Day");
        System.out.println("4. By Hour");
        System.out.println("------------------------");
        String hireType = null;
        int number2;
        do {
            System.out.println("Enter your selection: ");
            number2 = Integer.parseInt(scanner.nextLine());
        } while (number2 <= 0 || number2 > 4);

        switch (number2) {
            case 1 -> hireType = "By year";
            case 2 -> hireType = "By monthly";
            case 3 -> hireType = "By day";
            case 4 -> hireType = "By hour";
        }
        facility.setHireType(hireType);
        switch (option){
            case 1:
                String roomStandardVilla;
                do {
                    System.out.println("Enter room standard:");
                    roomStandardVilla = scanner.nextLine();
                }while (!Regex.CheckNameEmployee(roomStandardVilla));

                String swimmingArea;
                do {
                    System.out.println("Enter pool area:");
                    swimmingArea = scanner.nextLine();
                }while (!Regex.checkArea(swimmingArea));
                String numFloorsVilla;
                do {
                    System.out.println("Enter floor number:");
                    numFloorsVilla = scanner.nextLine();
                }while (!Regex.checkLimitPeopleAmount(numFloorsVilla));

                facility = new Villa(null,name,area,price,limitPeopleAmount,hireType,roomStandardVilla,swimmingArea,numFloorsVilla);
                break;
            case 2:
                String freeService;
                do {
                    System.out.println("Free translation is included:");
                    freeService = scanner.nextLine();
                }while (!Regex.regexFreeTranslation(freeService));

                facility = new Room(null,name,area,price,limitPeopleAmount,hireType,freeService);
                break;
            case 3:
                String roomStandardHouse;
                do {
                    System.out.println("Enter room standard:");
                    roomStandardHouse = scanner.nextLine();
                }while (!Regex.CheckNameEmployee(roomStandardHouse));
                String numFloorsHouse;
                do {
                    System.out.println("Enter floor number:");
                    numFloorsHouse = scanner.nextLine();
                }while (!Regex.checkLimitPeopleAmount(numFloorsHouse));

                facility = new House(null,name,area,price,limitPeopleAmount,hireType,roomStandardHouse,numFloorsHouse);
                break;
        }
        return facility;
    }
    public void displayListFacility(List<Facility> facilityList){
        for(Facility f : facilityList){
            System.out.println(f);
        }
    }
    public String inputIdFacility(){
        String string;
        do {
            System.out.println("Enter ID:");
            string = scanner.nextLine();
        }while (!Regex.regexIdFacility(string));
        return string;
    }
}
