package com.maroof.creationalDesignPatterns.abstractFactoryPattern;

interface Color {
    void fill();
}

class Red implements Color{
    @Override
    public void fill() {
        System.out.println(">> in Color Red :: fill method");
    }
}

class Green implements Color{
    @Override
    public void fill() {
        System.out.println(">> in Color Green :: fill method");
    }
}

class Blue implements Color{
    @Override
    public void fill() {
        System.out.println(">> in Color Blue :: fill method");
    }
}