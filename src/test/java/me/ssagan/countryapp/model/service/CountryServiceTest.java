package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountryServiceTest {
    private CountryService service;
    private Country country;

    @BeforeMethod
    private void setUp(){
        service = CountryService.getInstance();
        country = Country.getInstance();
    }

    @Test(description = "подсчет среднего возраста граждан")
    public void getCitizenAverageAge() {
        country.addCitizen(new Citizen("Фамилия1", "Имя1", 18, null), null);
        country.addCitizen(new Citizen("Фамилия2", "Имя2", 19, null), null);
        country.addCitizen(new Citizen("Фамилия3", "Имя3", 20, null), null);
        country.addCitizen(new Citizen("Фамилия4", "Имя4", 21, null), null);
        country.addCitizen(new Citizen("Фамилия5", "Имя5", 22, null), null);
        int actual = service.getCitizenAverageAge(country);
        Assert.assertEquals(actual, 20);
    }

    @Test()
    public void countRegion(){
        country.addRegion(new Region("Ярославская область", country));
        country.addRegion(new Region("Московская область", country));
        country.addRegion(new Region("Костромская область", country));
        int actual =  service.countRegion(country);
        Assert.assertEquals(actual, 3);
    }
}
