package com.maroof.creationalDesignPatterns.singleton.doubleCheckedLocking;

public class Singleton {

    // private and only instance of Singleton
    // volatile keyword ensures that value change by one thread
    // will also be affected in other thread
    // volatile for thread safety
    private static volatile Singleton uniqueInstance = null;

    // other member variable
    private int data;

    // private constructor
    // no other class can access it
    private Singleton(){}
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){  //we only synchronized first time through
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int data){
        this.data = data;
    }
}
