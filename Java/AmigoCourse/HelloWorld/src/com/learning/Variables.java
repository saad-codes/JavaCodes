package com.learning;

public class Variables {
    public static void main(String[] args){
        // Primitive Types
        int a=10;
        int b=a; // b is assigned premitively here and get values from a
        int c=a+b;
        System.out.println(c);
        a = 11; // now if we change the value of a it will not affect the value of b

        c=a+b;
        System.out.println(c);


        // Reference

        Person myname = new Person("saad");  // Person("saad") is object and here myname and myfriend is referencing from the object
        Person fried = myname;
        System.out.println("Before changing myname");
        System.out.println(myname.name);
        System.out.println(fried.name);

        myname.name = "Azeem";

        System.out.println("After changing myname");
        System.out.println(myname.name);
        System.out.println(fried.name);


    }



        static class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
        }
}

