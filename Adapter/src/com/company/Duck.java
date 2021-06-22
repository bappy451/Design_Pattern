package com.company;

interface Duck {
    public void quack();
    public void fly();
}

class MllardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying!");
    }
}


