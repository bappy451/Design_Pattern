package com.company;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product(){ parts = new LinkedList<String>(); }

    public void add(String part){ parts.addLast(part); }

    public void show()
    {
        System.out.println("\nProduct has configuration as bellow:");
        for(int i=0; i<parts.size(); i++)
            System.out.print("\t"+parts.get(i));
    }
}
