package _01_models;

public class Villa extends House {
    private double poolArea;

    public Villa() {
    }

    public Villa(double poolArea) {
        this.poolArea = poolArea;
    }

    public Villa(String standardRoom, String othersFacilities, int floors, double poolArea) {
        super(standardRoom, othersFacilities, floors);
        this.poolArea = poolArea;
    }

    public Villa(String id, String name, double area, int cost, int maxTotalPersons, String typeRent, String standardRoom, String othersFacilities, int floors, double poolArea) {
        super(id, name, area, cost, maxTotalPersons, typeRent, standardRoom, othersFacilities, floors);
        this.poolArea = poolArea;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "Villa{" +
                        "poolArea=" + poolArea +

                        '}';
    }

    @Override
    public String showInfor() {
        return " Services Villa !";
    }

}
