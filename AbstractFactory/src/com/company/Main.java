package com.company;

import com.company.Factory.AbsFactoryD;
import com.company.color.Color;
import com.company.shape.Shape;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        System.out.println("Hello world!");
        AbsFactoryD factory1 = AbstractFactory.getFactory("Shape");
        Shape shape1 = factory1.getShape("Square");
        shape1.draw();

        Shape shape2 = factory1.getShape("Rectangle");
        shape2.draw();

        AbsFactoryD factory2 = AbstractFactory.getFactory("Color");
        Color color1 = factory2.getColor("Blue");
        color1.fill();
    }
}
