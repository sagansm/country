package me.ssagan.countryapp.view;

public class ConsoleWriter {
    private static ConsoleWriter instance;
    private ConsoleWriter(){
    }
    public static ConsoleWriter getInstance(){
        if(instance == null){
            instance = new ConsoleWriter();
        }
        return instance;
    }

    public void display(String str){
        System.out.println(str);
    }
    public void display(String caption, String str){
        System.out.println(caption + ": " + str);
    }

    public void display(String caption, String[] array){
        System.out.println(caption);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}
