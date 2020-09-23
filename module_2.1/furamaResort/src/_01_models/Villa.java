package _01_models;

public class Villa extends Services {
    private String standardRoom;
    private String othersFacilities;
    private double poolArea;
    private int floors;
    public Villa() {
    }

    public Villa(String standardRoom, String othersFacilities, double poolArea, int floors) {
        this.standardRoom = standardRoom;
        this.othersFacilities = othersFacilities;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String id, String name, double area, int cost, int maxTotalPersons, String typeRent, String standardRoom, String othersFacilities, double poolArea, int floors) {
        super(id, name, area, cost, maxTotalPersons, typeRent);
        this.standardRoom = standardRoom;
        this.othersFacilities = othersFacilities;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOthersFacilities() {
        return othersFacilities;
    }

    public void setOthersFacilities(String othersFacilities) {
        this.othersFacilities = othersFacilities;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
    @Override
    public String showInfor(){
        return " Services Villa !";
    }

}
