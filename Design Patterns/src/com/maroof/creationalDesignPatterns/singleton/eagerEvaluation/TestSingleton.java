package com.maroof.creationalDesignPatterns.singleton.eagerEvaluation;

public class TestSingleton {

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();

        singleton.setData(77);

        System.out.println("First singleton instance : " + singleton);
        System.out.println("Singleton data : " + singleton.getData());

        singleton = null;

        singleton.setData(111);
        System.out.println("Second singleton instance : " + singleton); // have same reference as first object
        System.out.println("Singleton data : " + singleton.getData());
    }

}
