package com.learning;

public class Loops {
    public static void main(String[] args){
        int[] numArray = {0,1,23,83,47};
        for(int i= 0 ; i < numArray.length ; i++){
            System.out.println(numArray[i]);
        }

        // Enhanced For loop
        for (int number: numArray){
            System.out.println(number);
        }

        // While loop
        int i =0;
        while (i < numArray.length){
            System.out.println(numArray[i]);
            i++;
        }
        // do while loop
        do {
            System.out.println("Do while Loop started");
//            System.out.println(numArray[i]);
            i++;
        }
        while (i < numArray.length);

    }
}
