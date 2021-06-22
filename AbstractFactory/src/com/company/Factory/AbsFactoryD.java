package com.company.Factory;

import com.company.color.Blue;
import com.company.color.Color;
import com.company.color.Red;
import com.company.shape.Rectangle;
import com.company.shape.Shape;
import com.company.shape.Square;

public abstract class AbsFactoryD {
    public abstract Color getColor(String str)throws Exception;
    public abstract Shape getShape(String str) throws Exception;
}

