package com.learning;

public class Comparisons {
    public static void main(String[] args){
        // Compare values
        int myAge = 23;
        int azeemAge = 24;
        boolean iAmOlder = myAge > azeemAge;
        boolean azeemIsOlder = azeemAge > myAge;
        boolean sameAge = azeemAge==myAge;
        boolean notSameAge = azeemAge!=myAge;
        System.out.println("I am older =" + iAmOlder);
        System.out.println("Azeem is older =" + azeemIsOlder);
        System.out.println("Same age =" + sameAge);
        System.out.println("Not Same age =" + notSameAge);
    }
}
