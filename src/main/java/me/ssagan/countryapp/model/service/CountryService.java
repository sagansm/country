package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Country;

public class CountryService {

    public int getCitizenAverageAge(Country country) {
        int totalAge = 0;
        int averageAge = 0;
        if (!country.getCitizens().isEmpty()) {
            for (Citizen citizen : country.getCitizens()
            ) {
                totalAge = totalAge + citizen.getAge();
            }
            averageAge = (int)(totalAge/country.getCitizens().size());
        }
        return averageAge;
    }
}
