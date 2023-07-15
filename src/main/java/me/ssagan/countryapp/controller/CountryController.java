package me.ssagan.countryapp.controller;

import me.ssagan.countryapp.model.entity.Country;
import me.ssagan.countryapp.model.service.CountryGenerator;
import me.ssagan.countryapp.model.service.CountryService;

import javax.sound.midi.Soundbank;

public class CountryController {
    CountryGenerator generator = new CountryGenerator();
    Country country = generator.generateCountry();
    CountryService service = new CountryService();

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
                System.out.println("столица = " + country.getCapital());
                break;
            }
            case 2: {
                System.out.println("количесто областей = " + service.countRegion(country));
                break;
            }
            case 3: {
                System.out.println("площадь государства = " + country.getSquare());
                break;
            }
            case 4: {
                System.out.println("областные центры = " + service.getRegionCenters(country));
                break;
            }
            case 5: {
                System.out.println("средний возраст жителей = " + service.getCitizenAverageAge(country));
                break;
            }
            case 6: {
                //System.out.println("Введите число от 5 до 10");
                int n = 8;
                System.out.println("жители, у которых имя состоит из " + 8 + " букв = " + service.getCitizenNameLength(country,n));
                break;
            }
        }
    }
}
