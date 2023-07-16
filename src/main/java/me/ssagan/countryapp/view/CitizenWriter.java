package me.ssagan.countryapp.view;

import me.ssagan.countryapp.model.entity.Citizen;

import java.util.Collection;

public class CitizenWriter {
    public void display(Collection<Citizen> citizens) {
        for (Citizen citizen : citizens
        ) {
            System.out.format("     Фамилия: %-10s, Имя: %-10s, Возраст: %-3s, Область: %-100s", citizen.getSurname(), citizen.getName(), citizen.getAge(), citizen.getRegion().getName());
            System.out.println();
        }
    }

    public void displayToString(Collection<Citizen> citizens) {
        for (Citizen citizen : citizens
        ) {
            System.out.println(citizen.toString());
        }
    }
}
