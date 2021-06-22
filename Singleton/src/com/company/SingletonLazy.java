package com.company;

public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;
    private int data = 0;

    private SingletonLazy(){}

    public static SingletonLazy getInstance()
    {
        if(singletonLazy == null)
            singletonLazy = new SingletonLazy();
        return singletonLazy;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
