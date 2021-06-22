package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        //Default Factory Method implementation
        Shape shape1 = new SquareFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();


        //Most common Factory Method implementation
        ShapeFactory shapreFactory = new ShapeFactory();
        Shape shape3 = shapreFactory.getShape("Square");
        Shape shape4 = shapreFactory.getShape("rectangle");

        shape3.draw();
        shape4.draw();


        //Using Static method
        Shape shape5 = ShapeFactoryS.getShape("Square");
        Shape shape6 = ShapeFactoryS.getShape("rectangle");

        shape5.draw();
        shape6.draw();

    }
}
