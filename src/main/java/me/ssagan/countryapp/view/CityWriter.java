package me.ssagan.countryapp.view;

import me.ssagan.countryapp.model.entity.City;

import java.util.Collection;

public class CityWriter {
    public void display(Collection<City> cities){
        for (City city: cities
        ) {
            System.out.format("     Город: %-50s", city.getName());
            System.out.println();
        }
    }
}
