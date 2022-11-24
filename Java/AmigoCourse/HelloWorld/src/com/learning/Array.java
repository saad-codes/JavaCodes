package com.learning;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // Arrays
        int [] numbArray =  new int[3]; // Here 3 is the size of array
        System.out.println(Arrays.toString(numbArray)); // ere the array is having the values of zeros
        // we can define the type inside the array by using type String/char/ e.t.c
        numbArray[0] = 2; // Assigning the number to array at index zero
        System.out.println(Arrays.toString(numbArray));
        // Size of the array is fixed in the start


        // We can define the array in start with one single line
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[1]);

    }
}
