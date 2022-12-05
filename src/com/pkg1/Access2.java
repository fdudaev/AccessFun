package com.pkg1;

public class Access2 {
    public static void main(String[] args) {
        Access1 accountHolder = new Access1();

        System.out.println(accountHolder); // unable to get first and last name from Access1 class as they are private variable
    }

}
