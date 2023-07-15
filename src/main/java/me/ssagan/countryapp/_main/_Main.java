package me.ssagan.countryapp._main;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.service.CountryGenerator;
import me.ssagan.countryapp.model.service.CountryService;

public class _Main {

    public static void main(String[] args) {

        CountryGenerator generator = new CountryGenerator();

        Country country = generator.generateCountry();

        CountryService service = new CountryService();

        System.out.println("государство: " + country.getName());
        System.out.println("столица: " + country.getCapital());
        System.out.println("жители: ");

        for (Citizen citizen : country.getCitizens()
        ) {
            System.out.println(citizen.getId() + " " + citizen.getCountry().getName() + " " + citizen.getSurname() + " " + citizen.getName() + " " + citizen.getAge());
        }

        System.out.println("средний возраст жителей = " + service.getCitizenAverageAge(country));
    }
}
