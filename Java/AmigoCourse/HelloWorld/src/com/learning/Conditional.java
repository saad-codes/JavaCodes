package com.learning;

public class Conditional {
    public static void main(String[] args){
        // if else is based on logical operators
        int myAge = 28;
        String name = "Saad";
        Boolean Degree = true;
        if (Degree== true && (myAge < 26)){
            System.out.println(name +" has degree");
        }
        else if(Degree== true && (myAge > 26)){
            System.out.println(name + " has Degree and can marry");
        }
        else {
            System.out.println("No need to marry");
        }

        // Ternary Operator

        String message = myAge > 24 ?
                "All is good" :    //if part
                "No good";         // else part
        System.out.println(message);

        // Switch Statement

        switch ( myAge){
            case 20:
                System.out.println("He is Twenty");
                break;
            default:
                System.out.println("notings");
                break;
        }






    }

}
