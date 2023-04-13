package BasicsJava;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the year of your birth");
        int year = scan.nextInt();
        System.out.println("please enter the month of your birth");
        int month = scan.nextInt();
        System.out.println("please enter the day of your birth");
        int day = scan.nextInt();

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(year,month,day,12,55);
        long years = ChronoUnit.YEARS.between(birthday,today);
        long months = ChronoUnit.MONTHS.between(birthday,today);
        long weeks = ChronoUnit.WEEKS.between(birthday, today);
        long days = ChronoUnit.DAYS.between(birthday, today);
        long hours = ChronoUnit.HOURS.between(birthday, today);
        long minutes = ChronoUnit.MINUTES.between(birthday, today);
        System.out.println("your birthday is  " + birthday);
        System.out.println("we are in " + today);

        System.out.println();
        System.out.println("you have been in earth : " + years + "years");
        System.out.println("you have been in earth : " + months + "months");
        System.out.println("you have been in earth : " + weeks + "weeks");
        System.out.println("you have been in earth : " + days + "days");
        System.out.println("you have been in earth : " + hours + "hours");
        System.out.println("you have been in earth : " + minutes + "minutes");
    }
}
