package me.ssagan.countryapp.util;

import me.ssagan.countryapp.model.entity.*;

public class CountryGenerator {
    private static CountryGenerator instance;

    private CountryGenerator(){
    }

    public static CountryGenerator getInstance(){
        if (instance == null) {
            instance = new CountryGenerator();
        }
        return instance;
    }

    public Country generateCountry() {
        Country country = Country.getInstance();
        country.setName("Россия");
        country.setSquare(17098246);
        Region regionYar = new Region("Ярославская область", country);
        Area areaYar = new Area("город Ярославль", regionYar);
        City cityYar = new City("г Ярославль", areaYar);
        regionYar.setCenter(cityYar);
        generateCitizens(country, cityYar, 10 * (int) (Math.random() * 5));
        Area areaYR = new Area("Ярославскиий", regionYar);
        City cityYer = new City("Ермолово", areaYR);
        generateCitizens(country, cityYer, 10 * (int) (Math.random() * 5));
        Region regionMos = new Region("Москва", country);
        Area areaMos = new Area("Москва", regionMos);
        City cityMos = new City("Москва", areaMos);
        regionMos.setCenter(cityMos);
        generateCitizens(country, cityMos, 100 * (int) (Math.random() * 5));
        country.setCapital(cityMos);
        country.addRegion(regionYar);
        country.addRegion(regionMos);
        return country;
    }

    private String generateRandomName() {
        int length = 5 + (int) (Math.random() * 6);
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) (97 + (int) (Math.random() * 25));
        }
        return new String(charArray);
    }

    private void generateCitizens(Country country, City city, int number) {
        for (int i = 0; i < number; i++) {
            Citizen citizen = new Citizen(generateRandomName(), generateRandomName(), (int) (Math.random() * 100), city);
            country.addCitizen(citizen, city);
        }
    }
}
