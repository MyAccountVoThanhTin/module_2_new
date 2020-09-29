package _01_models;

public class House extends Services {
    private String standardRoom;
    private String othersFacilities;
    private int floors;

    public House() {
    }

    public House(String standardRoom, String othersFacilities, int floors) {
        this.standardRoom = standardRoom;
        this.othersFacilities = othersFacilities;
        this.floors = floors;
    }

    public House(String id, String name, double area, int cost, int maxTotalPersons, String typeRent, String standardRoom, String othersFacilities, int floors) {
        super(id, name, area, cost, maxTotalPersons, typeRent);
        this.standardRoom = standardRoom;
        this.othersFacilities = othersFacilities;
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "House{" +
                        "standardRoom='" + standardRoom + '\'' +
                        ", othersFacilities='" + othersFacilities + '\'' +
                        ", floors=" + floors +

                        '}';
    }

    public String showInfor() {
        return " Services House !";
    }
}
