package com.company;

public class SingletonBillPuge {
    private int data = 0;
    private SingletonBillPuge(){}

    private static class SingletonHelper{
        private static final SingletonBillPuge bil = new SingletonBillPuge();
    }

    public static SingletonBillPuge getInstance(){ return SingletonHelper.bil; }

    public int getData() { return data; }

    public void setData(int data) { this.data = data; }
}
