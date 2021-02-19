package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private final int fullness = 0; // сытость кота по умолчанию

    public int getAppetite () {
        return appetite;
    }
    private int appetite;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat (Plate plate) {
        System.out.println(name +" ест " + appetite + "% еды");
        if (appetite < plate.getFood()) {
            plate.desreazFood(appetite);
            appetite = fullness;
        } else {
            System.out.println("В тарелке столько еды нет");
        }

    }
    public void full () {
        if (fullness == appetite) {
            System.out.println(name + " поел");
        } else {
            System.out.println(name + " не поел");
        }

    }
}
