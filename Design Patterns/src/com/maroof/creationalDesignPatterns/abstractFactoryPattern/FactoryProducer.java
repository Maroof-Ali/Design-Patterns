package com.maroof.creationalDesignPatterns.abstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType == null){
            return null;
        }
        else if(factoryType.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else if(factoryType.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
