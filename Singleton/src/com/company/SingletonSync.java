package com.company;

public class SingletonSync {
    private static SingletonSync singletonSync = null;
    private int data = 0;

    private SingletonSync(){}

    public static synchronized SingletonSync getInstance(){
        if(singletonSync == null)
            singletonSync = new SingletonSync();
        return singletonSync;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
