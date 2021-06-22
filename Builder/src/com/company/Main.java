package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motoBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product car = carBuilder.getVechicle();
        car.show();
    }
}
