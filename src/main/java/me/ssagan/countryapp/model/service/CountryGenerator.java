package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Country;

public class CountryGenerator {

    public Country generateCountry(){
        Country country = Country.getInstance();
        country.setName("Montenegro");
        country.setCapital("Podgorica");
        int citizenId = 0;
        for (int i = 0; i < 10; i++) {
            Citizen citizen = new Citizen(++citizenId);
            citizen.setSurname(generateRandomName());
            citizen.setName(generateRandomName());
            citizen.setAge((int)(Math.random()*100));
            country.addCitizen(citizen);
        }
        return country;
    }

    private String generateRandomName(){
        int length = 5 + (int)(Math.random()*5);
        char[] charArray = new char[length];

        for (int i = 0; i < length; i++) {
            charArray[i] = (char) (97+(int)(Math.random()*25));
        }
        return new String(charArray);
    }
}
