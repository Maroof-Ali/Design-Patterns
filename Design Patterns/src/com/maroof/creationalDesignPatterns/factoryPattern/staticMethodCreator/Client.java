package com.maroof.creationalDesignPatterns.factoryPattern.staticMethodCreator;

public class Client {
    public static void main(String[] args){

        System.out.println("Static method creator");

        Shape shape1 = ShapeFactory.getShape("rectangle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("circle");
        shape3.draw();
    }
}
