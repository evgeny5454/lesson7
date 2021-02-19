package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }
    public void info () {
        if (food <= 0) {
            System.out.println("Еды больше нет");
        } else {
            System.out.println("Еды в тарелке: " + food +"%");
        }

    }
    public void desreazFood (int n) {
        food -= n;

    }
    public void setFood (int food) {
        this.food = food;
    }
    public int getFood () {
            return food;
    }

}
