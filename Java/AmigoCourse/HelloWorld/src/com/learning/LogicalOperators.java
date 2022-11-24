package com.learning;

public class LogicalOperators {
    public static void main(String[] args){
        boolean falsed = false;
        boolean trued = true;
        System.out.println(falsed && trued); // and operator
        System.out.println(falsed || trued); // or operator
        System.out.println((falsed && trued) || falsed); // or over and operators
        System.out.println(!falsed); // negation operator is !
    }
}
