package com.company;

public class SingletonEagerInit {
    private static SingletonEagerInit init = new SingletonEagerInit();
    private int data = 0;

    private SingletonEagerInit(){}

    public static SingletonEagerInit getInstance(){
        return init;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
