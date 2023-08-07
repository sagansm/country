package me.ssagan.countryapp._main;

import me.ssagan.countryapp.controller.CountryController;
import me.ssagan.countryapp.view.ConsoleWriter;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        CountryController controller = CountryController.getInstance();

        String[] menuItems = new String[]{"Выберите вариант:",
                "0 - выход",
                "1 - столица",
                "2 - количество областей",
                "3 - площадь государства",
                "4 - областные центры",
                "5 - средний возраст жителей",
                "6 - жители у которых имя состоит из n букв",
                "7 - список жителей у которых имя начинается с буквы"};

        ConsoleWriter.getInstance().display(menuItems);
        Scanner scanner = new Scanner(System.in);
        int menuIndex;
        while (true) {
            menuIndex = scanner.nextInt();
            if (menuIndex == 0) {
                break;
            }
            controller.callCountryMethod(menuIndex);
        }
    }
}
