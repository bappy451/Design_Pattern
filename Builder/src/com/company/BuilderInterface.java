package com.company;

interface BuilderInterface {
    void buildBody();
    void insetWheels();
    void addHeadlights();
    Product getVechicle();
}

class Car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is body of the car");
    }

    @Override
    public void insetWheels() {
        product.add("This is Wheel of the car");
    }

    @Override
    public void addHeadlights() {
        product.add("This is Head Light of the car");
    }

    @Override
    public Product getVechicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface
{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is body of the motorcycle");
    }

    @Override
    public void insetWheels() {
        product.add("This is Wheel of the motorcycle");
    }

    @Override
    public void addHeadlights() {
        product.add("This is Head Light of the motorcycle");
    }

    @Override
    public Product getVechicle() {
        return product;
    }
}