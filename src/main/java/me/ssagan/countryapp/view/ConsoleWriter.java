package me.ssagan.countryapp.view;

public class ConsoleWriter {
    private static ConsoleWriter instance;

    private ConsoleWriter() {
    }

    public static ConsoleWriter getInstance() {
        if (instance == null) {
            instance = new ConsoleWriter();
        }
        return instance;
    }

    public void display(String... str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
