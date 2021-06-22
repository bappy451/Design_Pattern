package com.company;

public abstract class DefaulttFactory {
    //Default factory method!!!
    protected abstract Shape factoryMethod();
    public Shape getShape()
    {
        return factoryMethod();
    }
}

class RectangleFactory extends DefaulttFactory{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends DefaulttFactory{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}