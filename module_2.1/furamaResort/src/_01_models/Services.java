package _01_models;

public abstract class Services {
    private String id;
    private String name;
    private double area;
    private int cost;
    private int maxTotalPersons;
    private String typeRent;
    public Services(){

    }

    public Services(String id, String name, double area, int cost, int maxTotalPersons, String typeRent) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxTotalPersons = maxTotalPersons;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxTotalPersons() {
        return maxTotalPersons;
    }

    public void setMaxTotalPersons(int maxTotalPersons) {
        this.maxTotalPersons = maxTotalPersons;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxTotalPersons=" + maxTotalPersons +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    public abstract String showInfor();
}
