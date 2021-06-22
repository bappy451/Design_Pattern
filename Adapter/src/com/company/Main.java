package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck = new MllardDuck();
        Turkey turkey = new WildTurkey();

        TurkeyAdapter turkeyToDuck = new TurkeyAdapter(turkey);
        turkey.gobble();
        turkeyToDuck.quack();
    }
}
