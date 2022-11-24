package com.learning;

import java.util.Arrays;

// import java.util.Arrays;

public class Methods {
    // This method is helpfull in converting all the chars in an array to lower case
    public static char[] listLowerCase(char [] arr){
        for(int i=0;i < arr.length ; i++){
            arr[i] = Character.toLowerCase(arr[i]);
        } 
        return  arr ;
    }

    // This method is helpfull in converting all the chars in an array to Upper case
    public static char[] listUperCase(char [] arr){
        for(int i=0;i < arr.length ; i++){
            arr[i] = Character.toUpperCase(arr[i]);
        } 
        return  arr ;
    }

    // This function will sum all nummbers in array 

    // This method is helpfull in converting all the chars in an array to Upper case
    public static int arraySum(Double [] arr){
        int summed = 0;
        for(int i=0;i < arr.length ; i++){
            summed +=arr[i] ;
        } 
        return  summed ;
    }


    public static void main(String[] args){
        System.out.println("Saad"); // println is default method
        String brand = "Samsung" ;
        System.out.println(brand.toUpperCase()); // Converts into upper case
        // Here in this we can see that the method is called with ()
        
        //Making New Methods in java
        char[] arr={'A','B' ,'C'}; 
        char[] upperCased =listUperCase(arr);
        System.out.println(Arrays.toString(upperCased));

        char[] lowerCased =listLowerCase(upperCased);
        System.out.println(Arrays.toString(lowerCased));
        Double[] numberList = {1.3,2.3,4.0,5.0,60.0} ;

        int summed = arraySum(numberList);
        System.out.println(summed);



    }



}