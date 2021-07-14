package com.aca.disqo;

import com.aca.disqo.immutableclass.Car;
import com.aca.disqo.immutableclass.Engine;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(178,2000, 220);
        Car car = new Car(2012,"w212","Mercedes", engine);
        System.out.println(car.getEngine().getWeight());
        car.getEngine().setWeight(2500);
        System.out.println(car.getEngine().getWeight());

    }
}
