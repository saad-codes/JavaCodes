package com.learning;

public class StringClasses {
    // Strings
    public static void main(String[] args){
        char a = 'A';
        System.out.println(a); // can have only one character
        // String is a class and we make object of type string
        String name = new String("Saadcodes");
        System.out.println(name.toUpperCase()); // used to store and manipulat the text as on object we have tons of methods
        System.out.println(name.contains("code"));// They are used often and we dont use "new"
        System.out.println(name.equals("code"));
        // Concatenating Strings

        System.out.println("My name is " + name + " you can call me " + name.substring(0,4));
        System.out.println("My name is ".concat(name).concat( " you can call me " + name.substring(0,4)));

    }
}
