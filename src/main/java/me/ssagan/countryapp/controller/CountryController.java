package me.ssagan.countryapp.controller;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.City;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.entity.Region;
import me.ssagan.countryapp.model.service.CitizenService;
import me.ssagan.countryapp.model.service.CountryGenerator;
import me.ssagan.countryapp.model.service.CountryService;
import me.ssagan.countryapp.view.CitizenWriter;
import me.ssagan.countryapp.view.CityWriter;

import java.util.HashSet;
import java.util.Scanner;

public class CountryController {
    CountryGenerator generator = new CountryGenerator();
    Country country = generator.generateCountry();
    CountryService service = new CountryService();

    CitizenService citizenService = new CitizenService();
    CitizenWriter citizenWriter = new CitizenWriter();

    CityWriter cityWriter = new CityWriter();

    //5.1 вывести на консоль столицу,
    // 5.2 количество областей,
    // 5.3 площадь государства,
    // 5.4 областные центры,
    // 5.5 средний возраст жителей,
    // 5.6 жителей у которых имя состоит из n букв ( чисто n  вводится  с клавиатуры).
    // 5.7 пункты 5.2 - 5.6 должны считаться в момент вызова метода, а не заранее. (т.е. пользователь делает выбор ->  вызывается метод -> вычисляются данные)

    public void callCountryMethod(int index) {
        switch (index) {
            case 1: {
                System.out.println("столица = " + country.getCapital().getName());
                break;
            }
            case 2: {
                System.out.println("количесто областей = " + service.countRegion(country));
                break;
            }
            case 3: {
                System.out.format("площадь государства = %,.0f км2", country.getSquare());
                System.out.println();
                break;
            }
            case 4: {
                HashSet<City> cities = service.getRegionCenters(country);
                System.out.println("областные центры: ");
                cityWriter.display(cities);
                break;
            }
            case 5: {
                System.out.println("средний возраст жителей = " + service.getCitizenAverageAge(country));
                break;
            }
            case 6: {
                System.out.println("Введите число от 5 до 10");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                HashSet<Citizen> citizens = service.getCitizenNameLength(country, n);
                System.out.println("жители, у которых имя состоит из " + n + " букв: ");
                citizenWriter.display(citizens);
                break;
            }
            case 7: {
                System.out.println("Введите букву");
                Scanner scanner = new Scanner(System.in);
                String n = scanner.nextLine();
                HashSet<Citizen> citizens = service.getCitizenStartsWith(country, n);
                System.out.println("жители, у которых имя начинается с буквы " + n + ":");
                for (Region region:country.getRegions()
                     ) {
                    System.out.println(region.toString());
                    HashSet<Citizen> filteredCitizens = citizenService.filterCitizen(citizens, region);
                    citizenWriter.displayToString(filteredCitizens);
                }
                break;
            }

        }
    }
}
