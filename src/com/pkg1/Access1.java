package com.pkg1;

public class Access1 {

    // access modifier is default is access modifier is not mentioned.
    int hours = 2;  //Default - allows anyone within the same package to see data
    int minutes = 50; // default

    public int runTimeHr = 1; // Public - accessible anywhere within the project ( even in different package)
    public int runTimeMin = 34;

    private String firstName = "Bilal"; //Private - accessible only with the same class, nowhere else(not even to the same class, within the same package)
    private String lastName = "Farrukhi";
    protected double num1 = 23; // Protected - accessible anywhere in the same package and to outside package ONLY if extended from protected variable class.
    protected double num2 = 43;
}
