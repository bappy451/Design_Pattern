package com.company.Factory;

import com.company.color.Color;
import com.company.shape.Rectangle;
import com.company.shape.Shape;
import com.company.shape.Square;

public class ShapeFactory extends AbsFactoryD {
    @Override
    public Color getColor(String str) {
        return null;
    }

    @Override
    public Shape getShape(String str) throws Exception {
        if (str.equalsIgnoreCase("Square"))
            return new Square();
        else if (str.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else throw new Exception("Shape " + str + "does not exits!");
    }
}
