package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Region;

import java.util.HashSet;

public class CitizenService {
    private static CitizenService instance;

    private CitizenService() {
    }

    public static CitizenService getInstance() {
        if (instance == null) {
            instance = new CitizenService();
        }
        return instance;
    }

    public HashSet<Citizen> filterCitizen(HashSet<Citizen> citizens, Region region) {
        HashSet<Citizen> filteredCitizen = new HashSet<>();
        for (Citizen citizen : citizens) {
            if (citizen.getRegion() == region) {
                filteredCitizen.add(citizen);
            }
        }
        return filteredCitizen;
    }
}
