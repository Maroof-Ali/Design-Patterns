package com.maroof.creationalDesignPatterns.singleton.lazyEvaluation;

public class Singleton {

    // private and only instance of Singleton
    private static Singleton uniqueInstance = null;

    // other member variable
    private int data;

    // private constructor
    // no other class can access it
    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
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
