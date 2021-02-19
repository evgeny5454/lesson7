package ru.geekbrains.lesson7;

import java.lang.reflect.Array;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Cat cat = new Cat("Барсик", 48 );
        Cat cat1 = new Cat("Шарик", 16 );
        Cat cat2 = new Cat("Мурзик", 32 );
        Cat cat3 = new Cat("Бусик", 21 );



        plate.info();
        cat.eat(plate);
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        plate.info();
        cat.full();
        cat1.full();
        cat2.full();
        cat3.full();


    }

}
