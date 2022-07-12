package com.maroof.creationalDesignPatterns.abstractFactoryPattern;

abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}

class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        else if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}