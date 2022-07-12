package com.maroof.creationalDesignPatterns.singleton.lazyEvaluation;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setData(99);

        System.out.println("First singleton instance : " + singleton);
        System.out.println("Singleton data : " + singleton.getData());

        singleton = null;

        singleton = Singleton.getInstance();
        System.out.println("First singleton instance : " + singleton);
        System.out.println("Singleton data : " + singleton.getData());
    }
}
