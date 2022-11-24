package com.learning;
import  java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Your name");
        String myName = name.nextLine();
        System.out.println("Your Name " + myName);
    }
}
