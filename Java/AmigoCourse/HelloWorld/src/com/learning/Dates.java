package com.learning;
import java.util.Date;
import java.time.LocalDate;
public class Dates {
    public static void main(String[] args){
        Date utilsDate = new Date();
        LocalDate localDate = LocalDate.now();
        System.out.println("utilsDate "+utilsDate);
        System.out.println("localDate " + localDate);
        // we import the packages this way and it because it will confuse the compiler if we import two methods of same name e.t.c
    }
}
