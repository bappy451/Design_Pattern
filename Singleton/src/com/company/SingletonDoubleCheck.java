package com.company;

public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck doubleCheck = null;
    private int data = 0;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance()
    {
        if(doubleCheck == null)
            synchronized (SingletonDoubleCheck.class){
            if(doubleCheck==null)
                doubleCheck = new SingletonDoubleCheck();
            }
        return doubleCheck;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
