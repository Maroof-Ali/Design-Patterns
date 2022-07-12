package com.maroof.creationalDesignPatterns.factoryPattern.abstractCreator;

public class Client {

    public static void main(String[] args){
        // get an object of Rectangle and call its draw method

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();

        // same for other

        Shape square = new SquareFactory().getShape();
        square.draw();

        Shape circle = new CircleFactory().getShape();
        circle.draw();

    }

}
