package _0_project_furama_resort._01_models;

public class FreeService {
    private String nameFreeService;
    private int unit;
    private double costFreeService;

    public FreeService(){

    }

    public FreeService(String nameFreeService, int unit, double costFreeService) {
        this.nameFreeService = nameFreeService;
        this.unit = unit;
        this.costFreeService = costFreeService;
    }

    public String getNameFreeService() {
        return nameFreeService;
    }

    public void setNameFreeService(String nameFreeService) {
        this.nameFreeService = nameFreeService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getCostFreeService() {
        return costFreeService;
    }

    public void setCostFreeService(double costFreeService) {
        this.costFreeService = costFreeService;
    }

    @Override
    public String toString() {
        return "FreeService{" +
                "nameFreeService='" + nameFreeService + '\'' +
                ", unit=" + unit +
                ", costFreeService=" + costFreeService +
                '}';
    }
}
