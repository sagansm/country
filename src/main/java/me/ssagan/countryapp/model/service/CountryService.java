package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.City;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.entity.Region;

import java.util.ArrayList;

public class CountryService {

    public int getCitizenAverageAge(Country country) {
        int totalAge = 0;
        int averageAge = 0;
        if (!country.getCitizens().isEmpty()) {
            for (Citizen citizen : country.getCitizens()
            ) {
                totalAge = totalAge + citizen.getAge();
            }
            averageAge = (int) (totalAge / country.getCitizens().size());
        }
        return averageAge;
    }

    public int countRegion(Country country){
        return country.getRegions().size();
    }

    public ArrayList<String> getRegionCenters(Country country){

        ArrayList<String> regionCenters = new ArrayList<>();

        for (Region region:country.getRegions()
             ) {
            regionCenters.add(region.getCenter().getName());
        }

        return regionCenters;
    }

    public ArrayList<String> getCitizenNameLength(Country country, int n ){

        ArrayList<String> CitizenNames = new ArrayList<>();

        for (Citizen citizen:country.getCitizens()
        ) {
            if(citizen.getName().length() == n){
                CitizenNames.add(citizen.getName());
            }
        }
        return CitizenNames;
    }

}
