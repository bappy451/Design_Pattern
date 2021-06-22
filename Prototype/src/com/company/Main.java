package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeCache.loadCache();

        Shape clone = ShapeCache.getShape("1");
        System.out.println("Shape: "+ clone.getType());
    }
}
