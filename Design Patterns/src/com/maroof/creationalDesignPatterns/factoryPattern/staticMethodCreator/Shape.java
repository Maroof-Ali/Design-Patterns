package com.maroof.creationalDesignPatterns.factoryPattern.staticMethodCreator;

interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println(">> in Rectangle :: draw method");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println(">> in Square :: draw method");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println(">> in Circle :: draw method");
    }
}