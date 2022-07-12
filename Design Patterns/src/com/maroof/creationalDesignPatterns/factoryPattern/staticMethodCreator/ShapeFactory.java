package com.maroof.creationalDesignPatterns.factoryPattern.staticMethodCreator;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        return null;
    }
}