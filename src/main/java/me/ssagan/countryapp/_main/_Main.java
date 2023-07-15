package me.ssagan.countryapp._main;

import me.ssagan.countryapp.controller.CountryController;

import java.util.Scanner;

public class _Main {

    public static void main(String[] args) {

        CountryController controller = new CountryController();

        System.out.println("Выберите вариант:");
        System.out.println("0 - выход");
        System.out.println("1 - вывести на консоль столицу");
        System.out.println("2 - количество областей");
        System.out.println("3 - площадь государства");
        System.out.println("4 - областные центры");
        System.out.println("5 - средний возраст жителей");
        System.out.println("6 - жителей у которых имя состоит из n букв ( чисто n  вводится  с клавиатуры).");

        Scanner scanner = new Scanner(System.in);
        int menuIndex;

        while (true) {
            menuIndex = scanner.nextInt();
            if (menuIndex == 0) {
                break;
            }
            controller.callCountryMethod(menuIndex);
        }

//Вывести список жителей у которых имя начинается с буквы char m (символ m вводится с клавиатуры).
//Вывод может быть красиво отформатирован (например список жителей для 1 области, для второй и т.д.).
//Вывод должен осуществляться с использованием
// метода toString() класса Гражданин И
// метода toString() другого класса в зависимости от вашей логики (например toString() класса "Государство")

    }
}
