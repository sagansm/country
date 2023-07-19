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

    public void display(Collection<Citizen> citizens) {
        for (Citizen citizen : citizens) {
            System.out.format("     Фамилия: %-10s, Имя: %-10s, Возраст: %-3s, Область: %-100s", citizen.getSurname(), citizen.getName(), citizen.getAge(), citizen.getRegion().getName());
            System.out.println();
        }
    }

    public void displayToString(Collection<Citizen> citizens) {
        for (Citizen citizen : citizens) {
            System.out.println(citizen.toString());
        }
    }
}
