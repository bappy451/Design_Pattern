package com.company;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

class ShapeFactory {
    //Most common implementation of Factory Method
    public Shape getShape(String str) throws Exception{
        if(str.equalsIgnoreCase("Square"))
            return new Square();
        else if(str.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else throw new Exception("Shape "+ str + "does not exits!");
    }
}

class ShapeFactoryS {
    //Most common implementation of Factory Method
    public static Shape getShape(String str) throws Exception{
        if(str.equalsIgnoreCase("Square"))
            return new Square();
        else if(str.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else throw new Exception("Shape "+ str + "does not exits!");
    }
}

