package lab2.ch1.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        final int month = 4;
        LocalDate date = LocalDate.of(2020, month , 1);
        int weekOffset;
        if(date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            weekOffset = date.getDayOfWeek().ordinal() - DayOfWeek.MONDAY.ordinal() + 1;
        }else {
            //weekOffset = date.getDayOfWeek().ordinal() - DayOfWeek.SUNDAY.ordinal();
            weekOffset = 0;
        }
        String firstLineOffset = new String(new char[ weekOffset ]).replace("\0" ,"    ");
        System.out.print(firstLineOffset);
        while (date.getMonthValue() == month) {
            System.out.printf( "%4d" , date.getDayOfMonth());
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY)
            {
                System.out.println ();
            }
            date = date.plusDays(1);
        }
    }
}