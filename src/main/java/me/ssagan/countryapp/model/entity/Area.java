package me.ssagan.countryapp.model.entity;

public class Area {
    private String name;
    private Region region;

    public Area(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }

    public String toString() {
        return String.format("     Название: %-50s", this.getName());
    }

}
