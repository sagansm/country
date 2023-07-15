package me.ssagan.countryapp._main;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.service.CountryService;

public class _Main {

    public static void main(String[] args) {
        Citizen firstCitizen = new Citizen();
        firstCitizen.setName("Svetlana");
        firstCitizen.setAge(40);

        Citizen secondCitizen = new Citizen();
        secondCitizen.setName("Polina");
        secondCitizen.setAge(10);

        Country myCountry = Country.getInstance();
        myCountry.setName("Montenegro");
        myCountry.setCapital("Podgorica");
        myCountry.addCitizen(firstCitizen);
        myCountry.addCitizen(secondCitizen);

        CountryService service = new CountryService();

        System.out.println("государство: " + myCountry.getName());
        System.out.println("столица: " + myCountry.getCapital());
        System.out.println("средний возраст жителей = " + service.getCitizenAverageAge(myCountry));
    }
}
