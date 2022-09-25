package com.oladevedojo.javacore.Rdate.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1996, Month.JANUARY, 4,8,2);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
