package com.maroof.creationalDesignPatterns.factoryPattern.abstractCreator;

/*
The disadvantage of abstract creation in you have to create Factories for
all subclasses.
*/
public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
    // all other helper methods here...
}

class RectangleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod(){
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory{
    protected Shape factoryMethod(){
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod(){
        return new Circle();
    }
}
