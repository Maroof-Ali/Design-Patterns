package com.maroof.creationalDesignPatterns.abstractFactoryPattern;

import com.maroof.creationalDesignPatterns.factoryPattern.staticMethodCreator.ShapeFactory;

public class Client {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1 = colorFactory.getColor("Red");
        color1.fill();
        Color color2 = colorFactory.getColor("Green");
        color2.fill();
        Color color3 = colorFactory.getColor("Blue");
        color3.fill();

    }
}
