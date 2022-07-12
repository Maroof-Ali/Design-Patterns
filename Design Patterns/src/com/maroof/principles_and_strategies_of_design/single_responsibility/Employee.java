package com.maroof.principles_and_strategies_of_design.single_responsibility;

import java.util.Date;

/*
*The idea behind the SRP is that every class, module,
* or function in a program should have one responsibility/purpose in a program.
* As a commonly used definition, "every class should have only one reason to change".
* */
public class Employee {
    private long id;
    private String name;
    private String address;
    private Date joiningDate;

    // This class violates SRP, because
    // income tax calculation should not be Employee class responsibility
    // this should be done by Finance department or class
    // same or the logic of promotion should be decided by HR class

    public void calculateIncomeTax(){
        // income tax logic
    }

    public void calculateIsPromotionDue(){
        // promotion logic
    }

}
