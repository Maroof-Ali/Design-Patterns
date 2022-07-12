package com.maroof.creationalDesignPatterns.singleton.eagerEvaluation;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();
    private int data;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
