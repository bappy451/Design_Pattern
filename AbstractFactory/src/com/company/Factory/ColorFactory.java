package com.company.Factory;

import com.company.color.Blue;
import com.company.color.Color;
import com.company.color.Red;
import com.company.shape.Shape;

public class ColorFactory extends AbsFactoryD {
    @Override
    public Color getColor(String str) throws Exception {
        if (str.equalsIgnoreCase("Blue"))
            return new Blue();
        if (str.equalsIgnoreCase("Red"))
            return new Red();
        else throw new Exception("Color " + str + "does not exits!");
    }

    @Override
    public Shape getShape(String str) {
        return null;
    }
}
