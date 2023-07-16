package me.ssagan.countryapp.model.entity;

public class Region {
    private String name;
    private Country country;
    private City Center;

    public Region(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public City getCenter() {
        return Center;
    }

    public void setCenter(City center) {
        Center = center;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String toString(){
        return String.format("  Область: %-50s", this.getName());
    }

}
