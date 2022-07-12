package com.maroof.creationalDesignPatterns.singleton.doubleCheckedLocking;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setData(22);

        System.out.println("First singleton instance : " + singleton);
        System.out.println("Singleton data : " + singleton.getData());

        singleton = null;

        singleton = Singleton.getInstance();
        System.out.println("First singleton instance : " + singleton);
        System.out.println("Singleton data : " + singleton.getData());
    }
}
