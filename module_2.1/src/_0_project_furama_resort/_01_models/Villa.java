package _0_project_furama_resort._01_models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private double poolArea;
    private int numberOfFloor;

    public Villa(){

    }

    public Villa(String standardRoom, String ortherFacilities, double poolArea, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = ortherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String idServices, String nameServices, double areaUseServices, double rentCostServices, int totalPerson, String typeRent, String standardRoom, String ortherFacilities, double poolArea, int numberOfFloor) {
        super(idServices, nameServices, areaUseServices, rentCostServices, totalPerson, typeRent);
        this.standardRoom = standardRoom;
        this.otherFacilities = ortherFacilities;
        this.poolArea = poolArea;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    /**
     * String idServices, String nameServices, double areaUseServices, double rentCostServices, int totalPerson,
     * String typeRent, String standardRoom, String ortherFacilities, double poolArea, int numberOfFloor
     */
    @Override
    public void showInfor() {
        System.out.println("ID="+idServices+" Name="+nameServices+" Area="+areaUseServices+
                " Cost="+rentCostServices+" Toal's person="+totalPerson+" Type rent="+typeRent + " Standard room="
                        +standardRoom+" Other facilities="+otherFacilities+ " Area's pool="+poolArea+" Floor="+numberOfFloor);
    }
}
