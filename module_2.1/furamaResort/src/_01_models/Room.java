package _01_models;

public class Room extends Services {
    private String freeServices;
    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String id, String name, double area, int cost, int maxTotalPersons, String typeRent, String freeServices) {
        super(id, name, area, cost, maxTotalPersons, typeRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    public String showInfor(){
        return " Services Room !";
    }

}
