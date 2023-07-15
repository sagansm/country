package me.ssagan.countryapp.model.entity;

public class Region {
    private String name;
    private Country country;
    private City Center;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCenter() {
        return Center;
    }

    public void setCenter(City center) {
        Center = center;
    }
}
