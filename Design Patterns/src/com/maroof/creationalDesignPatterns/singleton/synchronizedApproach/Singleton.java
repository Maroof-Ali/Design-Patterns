package com.maroof.creationalDesignPatterns.singleton.synchronizedApproach;

import java.io.Serializable;

public class Singleton {

    // private and only instance of Singleton
    private static Singleton uniqueInstance;

    // other member variable
    private int data;

    // private constructor
    // no other class can access it
    private Singleton(){}

    // by adding synchronized keyword, we are forcing each thread
    // to wait for its turn before entering this method
    // there are no race conditions
    public static synchronized Singleton getInstance(){
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
