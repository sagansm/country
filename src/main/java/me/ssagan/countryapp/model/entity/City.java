package me.ssagan.countryapp.model.entity;

public class City {
    private String name;

    private Area area;

    public City(String name, Area area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public Area getArea() {
        return area;
    }
}
