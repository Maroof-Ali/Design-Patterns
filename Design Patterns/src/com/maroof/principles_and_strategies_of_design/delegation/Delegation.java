package com.maroof.principles_and_strategies_of_design.delegation;
class RealPrinter{
    // this is the "delegate"
    public void print(String message){
        System.out.println(message);
    }
}
class Printer{
    // this is the "delegator"
    RealPrinter realPrinter = new RealPrinter();
    public void print(String message){
        realPrinter.print(message);
    }
}
public class Delegation {
    public static void main(String[] args){
        String message = "Hello Delegation";
        Printer printer = new Printer();
        printer.print(message);
    }

}
