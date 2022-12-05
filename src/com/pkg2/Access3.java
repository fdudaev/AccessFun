package com.pkg2;


import com.pkg1.Access1;

public class Access3  {
    public static void main(String[] args) {

        Access1 a2 = new Access1();
        System.out.println(a2.runTimeHr+":"+ a2.runTimeMin); // able to execute as runTimeHr and runTimeMin are public variables

    }

}
