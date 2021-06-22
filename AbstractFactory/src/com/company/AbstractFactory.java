package com.company;

import com.company.Factory.AbsFactoryD;
import com.company.Factory.ColorFactory;
import com.company.Factory.ShapeFactory;

public class AbstractFactory {
    public static AbsFactoryD getFactory(String str) throws Exception
    {
        if(str.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        else if(str.equalsIgnoreCase("Color"))
            return new ColorFactory();
        else throw new Exception("Factory "+ str + "is not defined!");
    }
}
