package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.setData(24);
        System.out.println("Data: "+singletonLazy.getData() + " and Object id: " + singletonLazy);
        singletonLazy = null;
        singletonLazy = SingletonLazy.getInstance();
        System.out.println("Data: "+singletonLazy.getData() + " and Object id: " + singletonLazy);

        //Sync Method
        SingletonSync sync = SingletonSync.getInstance();
        sync.setData(200);
        System.out.println("Sync Method:\nData: "+sync.getData() + " and Object id: " + sync);

        //Double Check Singleton Class
        SingletonDoubleCheck doubleCheck = SingletonDoubleCheck.getInstance();
        doubleCheck.setData(300);
        System.out.println("Double Check Sync Method:\nData: "+doubleCheck.getData() + " and Object id: " + doubleCheck);
    }
}
