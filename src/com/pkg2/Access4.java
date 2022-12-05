package com.pkg2;

import com.pkg1.Access1;

public class Access4 extends Access1{ // Access4 is extending from Access1 to give us ability to access PROTECTED variables.
    public static void main (String [] args){

        Access1 accountHolder = new Access1();
        System.out.println(accountHolder); // unable to access variables in firstName and lastName as they re private variable in Access1

        Access4 sumOfDouble = new Access4(); // need to create an instance of Access4 inorder to be able to access protected variable
        System.out.println(sumOfDouble.num1+sumOfDouble.num2);



    }
}
