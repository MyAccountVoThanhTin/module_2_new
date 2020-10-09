package _0_project_furama_resort._01_models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int numberOfFloor;

    public House(){

    }
    public House(String standardRoom, String ortherFacilities, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = ortherFacilities;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String idServices, String nameServices, double areaUseServices, double rentCostServices, int totalPerson, String typeRent, String standardRoom, String ortherFacilities, int numberOfFloor) {
        super(idServices, nameServices, areaUseServices, rentCostServices, totalPerson, typeRent);
        this.standardRoom = standardRoom;
        this.otherFacilities = ortherFacilities;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOrtherFacilities() {
        return otherFacilities;
    }

    public void setOrtherFacilities(String ortherFacilities) {
        this.otherFacilities = ortherFacilities;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public void showInfor() {
        System.out.println("House{" +
                ", idServices='" + idServices + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUseServices=" + areaUseServices +
                ", rentCostServices=" + rentCostServices +
                ", totalPerson=" + totalPerson +
                ", typeRent='" + typeRent + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", ortherFacilities='" + otherFacilities + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}');
    }
}
