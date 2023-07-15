package me.ssagan.countryapp.model.entity;

import java.util.HashSet;

public class Country {

    private static Country INSTANCE;

    private Country() {
    }

    public static Country getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Country();
        }
        return INSTANCE;
    }

    private String name;
    private String capital;
    private HashSet<Citizen> citizens = new HashSet<>() {
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public HashSet<Citizen> getCitizens() {
        return citizens;
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
        citizen.setCountry(this);
    }
}
