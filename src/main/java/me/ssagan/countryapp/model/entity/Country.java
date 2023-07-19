package me.ssagan.countryapp.model.entity;

import java.util.HashSet;

public class Country {
    private static Country instance;
    private String name;
    private City capital;
    private double square;
    private HashSet<Citizen> citizens = new HashSet<>();
    private HashSet<Region> regions = new HashSet<>();

    private Country() {
    }

    public static Country getInstance() {
        if (instance == null) {
            instance = new Country();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public HashSet<Citizen> getCitizens() {
        return citizens;
    }

    public void addCitizen(Citizen citizen, City city) {
        citizens.add(citizen);
        citizen.setCity(city);
    }

    public HashSet<Region> getRegions() {
        return regions;
    }

    public void addRegion(Region region) {
        regions.add(region);
        region.setCountry(this);
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
