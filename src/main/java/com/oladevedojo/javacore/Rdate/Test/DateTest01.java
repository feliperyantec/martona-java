package com.oladevedojo.javacore.Rdate.Test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000); //long 100000
        date.setTime(date.getTime() + 3_600_00);
        System.out.println(date);
    }
}
