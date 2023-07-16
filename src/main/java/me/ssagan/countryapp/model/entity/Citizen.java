package me.ssagan.countryapp.model.entity;

public class Citizen {
    private final int id;
    private String surname;
    private String name;
    private int age;
    private City city;

    public Citizen(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Area getArea() {
        return city.getArea();
    }

    public Region getRegion() {
        return city.getArea().getRegion();
    }

    public Country getCountry() {
        return city.getArea().getRegion().getCountry();
    }

    public String toString() {
        return String.format("     Фамилия: %-10s, Имя: %-10s, Возраст: %-3s, Область: %-100s", this.getSurname(), this.getName(), this.getAge(), this.getRegion().getName());
    }
}
