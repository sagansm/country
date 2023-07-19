package me.ssagan.countryapp.model.entity;

public class Citizen {
    private static int counter;
    private int id;
    private String surname;
    private String name;
    private int age;
    private City city;

    public Citizen(String surname, String name, int age, City city) {
        counter++;
        this.id = counter;
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.city = city;
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
        return String.format("     ID: %-5s, Фамилия: %-10s, Имя: %-10s, Возраст: %-3s, Область: %-100s", this.getId(), this.getSurname(), this.getName(), this.getAge(), this.getRegion().getName());
    }
}
