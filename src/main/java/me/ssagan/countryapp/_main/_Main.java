package me.ssagan.countryapp._main;

import me.ssagan.countryapp.controller.CountryController;
import me.ssagan.countryapp.view.ConsoleWriter;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        CountryController controller = CountryController.getInstance();

        String[] menuItems = new String[]{"выход",
                "столица",
                "количество областей",
                "площадь государства",
                "областные центры",
                "средний возраст жителей",
                "жители у которых имя состоит из n букв",
                "список жителей у которых имя начинается с буквы"};

        ConsoleWriter.getInstance().display("Выберите вариант:", menuItems);
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
