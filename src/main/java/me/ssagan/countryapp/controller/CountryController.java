package me.ssagan.countryapp.controller;

import me.ssagan.countryapp.model.entity.Citizen;
import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.entity.Region;
import me.ssagan.countryapp.model.service.CitizenService;
import me.ssagan.countryapp.model.service.CountryService;
import me.ssagan.countryapp.util.CountryGenerator;
import me.ssagan.countryapp.view.CitizenWriter;
import me.ssagan.countryapp.view.CityWriter;
import me.ssagan.countryapp.view.ConsoleWriter;

import java.util.HashSet;
import java.util.Scanner;

public class CountryController {
    private static CountryController instance;
    private final Country country;
    private final CountryService countryService;
    private final CitizenService citizenService;
    private final CitizenWriter citizenWriter;
    private final CityWriter cityWriter;
    private final ConsoleWriter consoleWriter;

    private CountryController() {
        country = CountryGenerator.getInstance().generateCountry();
        countryService = CountryService.getInstance();
        citizenService = CitizenService.getInstance();
        citizenWriter = CitizenWriter.getInstance();
        cityWriter = CityWriter.getInstance();
        consoleWriter = ConsoleWriter.getInstance();
    }

    public static CountryController getInstance() {
        if (instance == null) {
            instance = new CountryController();
        }
        return instance;
    }

    public void callCountryMethod(int index) {
        switch (index) {
            case 1: {
                consoleWriter.display("столица", country.getCapital().getName());
                break;
            }
            case 2: {
                consoleWriter.display("количесто областей", Integer.toString(countryService.countRegion(country)));
                break;
            }
            case 3: {
                consoleWriter.display("площадь государства", Double.toString(country.getSquare()));
                break;
            }
            case 4: {
                cityWriter.display("областные центры", countryService.getRegionCenters(country));
                break;
            }
            case 5: {
                consoleWriter.display("средний возраст жителей", Integer.toString(countryService.getCitizenAverageAge(country)));
                break;
            }
            case 6: {
                consoleWriter.display("Введите число от 5 до 10");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                citizenWriter.display("жители, у которых имя состоит из " + n + " букв", countryService.getCitizenNameLength(country, n));
                break;
            }
            case 7: {
                consoleWriter.display("Введите букву");
                Scanner scanner = new Scanner(System.in);
                String n = scanner.nextLine();
                HashSet<Citizen> citizens = countryService.getCitizenStartsWith(country, n);
                consoleWriter.display("жители, у которых имя начинается с буквы " + n + ":");
                for (Region region : country.getRegions()) {
                    citizenWriter.display(region.toString(), citizenService.filterCitizen(citizens, region));
                }
                break;
            }
        }
    }
}
