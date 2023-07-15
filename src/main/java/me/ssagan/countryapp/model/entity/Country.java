package me.ssagan.countryapp.model.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Country {
    private String name;
    private String capital;
    private HashSet<Citizen> citizens = new HashSet<Citizen>() {};

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

    public void addCitizen(Citizen citizen){
        citizens.add(citizen);
    }
}
