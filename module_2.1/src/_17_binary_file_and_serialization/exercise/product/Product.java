package _17_binary_file_and_serialization.exercise.product;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String manufacturer;
    private Double cost;
    private String orthers;

    public Product() {
    }

    public Product(String id, String name, String manufacturer, Double cost, String orthers) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.orthers = orthers;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOrthers() {
        return orthers;
    }

    public void setOrthers(String orthers) {
        this.orthers = orthers;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost=" + cost +
                ", orthers='" + orthers + '\'' +
                '}';
    }
}
