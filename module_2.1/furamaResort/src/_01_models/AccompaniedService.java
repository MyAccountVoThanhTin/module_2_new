package _01_models;

public class AccompaniedService {
    private String nameAccompaniedService;
    private int unit;
    private double cost;

    public AccompaniedService() {
    }

    public AccompaniedService(String nameAccompaniedService, int unit, double cost) {
        this.nameAccompaniedService = nameAccompaniedService;
        this.unit = unit;
        this.cost = cost;
    }

    public String getNameAccompaniedService() {
        return nameAccompaniedService;
    }

    public void setNameAccompaniedService(String nameAccompaniedService) {
        this.nameAccompaniedService = nameAccompaniedService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "AccompaniedService{" +
                "nameAccompaniedService='" + nameAccompaniedService + '\'' +
                ", unit=" + unit +
                ", cost=" + cost +
                '}';
    }
}
