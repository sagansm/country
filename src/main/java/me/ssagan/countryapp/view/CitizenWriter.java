package me.ssagan.countryapp.view;

import me.ssagan.countryapp.model.entity.Citizen;

import java.util.Collection;

public class CitizenWriter {
    private static CitizenWriter instance;

    private CitizenWriter() {
    }

    public static CitizenWriter getInstance() {
        if (instance == null) {
            instance = new CitizenWriter();
        }
        return instance;
    }

    public void display(String caption, Collection<Citizen> citizens) {
        System.out.println(caption + ": ");
        for (Citizen citizen : citizens) {
            System.out.println(citizen.toString());
        }
    }
}
