package me.ssagan.countryapp.model.service;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.entity.Region;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountryServiceTest {
    private CountryService service;
    private Country country;

    @BeforeTest
    private void setUp() {
        service = CountryService.getInstance();
        country = Country.getInstance();
    }

    @DataProvider(name = "citizensForAverageAge")
    public Object[][] createData() {
        country.addCitizen(new Citizen("Фамилия1", "Имя1", 18, null), null);
        country.addCitizen(new Citizen("Фамилия2", "Имя2", 19, null), null);
        country.addCitizen(new Citizen("Фамилия3", "Имя3", 20, null), null);
        country.addCitizen(new Citizen("Фамилия4", "Имя4", 21, null), null);
        country.addCitizen(new Citizen("Фамилия5", "Имя5", 22, null), null);
        return new Object[][]{{country, 20}};
    }

    @DataProvider(name = "regionsForCount")
    public Object[][] createReg() {
        country.addRegion(new Region("Ярославская область", country));
        country.addRegion(new Region("Московская область", country));
        country.addRegion(new Region("Костромская область", country));
        return new Object[][]{{country, 3}};
    }

    @Test(dataProvider = "citizensForAverageAge", description = "подсчет среднего возраста граждан")
    public void getCitizenAverageAge(Country country, int expected) {
        int actual = service.getCitizenAverageAge(country);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "regionsForCount", description = "количство областей")
    public void countRegion(Country country, int expected) {
        int actual = service.countRegion(country);
        Assert.assertEquals(actual, expected);
    }
}
