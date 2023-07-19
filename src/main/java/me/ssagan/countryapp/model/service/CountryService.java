package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.City;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.entity.Region;

import java.util.HashSet;

public class CountryService {
    private static CountryService instance;

    private CountryService() {
    }

    public static CountryService getInstance() {
        if (instance == null) {
            instance = new CountryService();
        }
        return instance;
    }

    public int getCitizenAverageAge(Country country) {
        int totalAge = 0;
        int averageAge = 0;
        if (!country.getCitizens().isEmpty()) {
            for (Citizen citizen : country.getCitizens()) {
                totalAge = totalAge + citizen.getAge();
            }
            averageAge = (int) (totalAge / country.getCitizens().size());
        }
        return averageAge;
    }

    public int countRegion(Country country) {
        return country.getRegions().size();
    }

    public HashSet<City> getRegionCenters(Country country) {
        HashSet<City> regionCenters = new HashSet<>();
        for (Region region : country.getRegions()) {
            regionCenters.add(region.getCenter());
        }
        return regionCenters;
    }

    public HashSet<Citizen> getCitizenNameLength(Country country, int n) {
        HashSet<Citizen> citizens = new HashSet<>();
        for (Citizen citizen : country.getCitizens()) {
            if (citizen.getName().length() == n) {
                citizens.add(citizen);
            }
        }
        return citizens;
    }

    public HashSet<Citizen> getCitizenStartsWith(Country country, String n) {
        HashSet<Citizen> citizens = new HashSet<>();
        for (Citizen citizen : country.getCitizens()) {
            if (citizen.getName().startsWith(n)) {
                citizens.add(citizen);
            }
        }
        return citizens;
    }
}
