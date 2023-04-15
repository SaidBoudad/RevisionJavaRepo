package BasicsJava;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class BasicExercises2 {

    public static void main(String[] args) {
        //1 reverse a number
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to inverse");
        num = scan.nextInt();
        int remainder, reverseNum = 0;
        System.out.printf("the reverse of the number %d is ", num);
        while (num > 0) {
            remainder = num % 10;
            num /= 10;
            reverseNum = (reverseNum * 10) + remainder;
        }
        System.out.printf(": %d", reverseNum);

        //2 sum of all digits of a number
        int number, sum = 0;
        System.out.println("enter a number to inverse");
        number = scan.nextInt();
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.printf("the reverse of the number %d is ", sum);

        //3 fibonacci sequence
        int Number, t1 = 0, t2 = 1, next;
        System.out.println("enter the number of terms in the Fibonacci Sequence do you want");
        Number = scan.nextInt();
        for (int i = 1; i <= Number; i++) {
            System.out.printf("Fibonacci %d is %d \n", i, t1);
            next = t1 + t2;
            t1 = t2;
            t2 = next;
        }

        //4 pattern of stars
        System.out.println("hwo many stars do you want in the pattern");
        int numberOfStars = scan.nextInt();
        for (int i = 1; i <= numberOfStars; i++) { //number of rows
            for (int j = 0; j < i; j++) {  //number of stars in every row
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = numberOfStars - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //5 duplicate character in a String
        System.out.println("enter the phrase to give you duplicates characters in it");
        String phrase = scan.nextLine();
        String characters = "";
        String duplicates = "";
        for (int i = 0; i < phrase.length(); i++) {
            String character = Character.toString(phrase.charAt(i));
            if (characters.contains(character) && !duplicates.contains(character)) {
                duplicates += character + " ' ";
            }
            characters += character;
        }
        System.out.println(duplicates);

        //6 calculate the age of the user years months weeks days hours
        System.out.println("please enter the year of your birth");
        int year = scan.nextInt();
        System.out.println("please enter the month of your birth");
        int month = scan.nextInt();
        System.out.println("please enter the day of your birth");
        int day = scan.nextInt();

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(year, month, day, 12, 55);
        long years = ChronoUnit.YEARS.between(birthday, today);
        long months = ChronoUnit.MONTHS.between(birthday, today);
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


        //7 check if the given String is a palindrome.
        String original = "ra mar";
        original = original.replace(" ", "");//String are imutable so we need to reassigning the changes to the original variable
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println(reverse);
        boolean palindrome = true;
        for (int i = 0; i < original.length() - 1; i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("yes it is a palindrome");
        } else System.out.println("Not a palindrome");

        //8 currency formatter
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if (payment < 0 || payment > Math.pow(10, 9)) {
            System.out.println("the giving number is out of rang");
        } else {
            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String India = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
            String China = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String France = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
            System.out.println("US: " + us);
            System.out.println("India: " + India);
            System.out.println("China: " + China);
            System.out.println("France: " + France);
        }

        //9 Fortune data random choice
        String[] fortunes = {"said","lina","samira","anir","khadija","simo","brahim","abdo","hassan","fatima","meryam","youssef"};
        Random rand = new Random();
        int fr = rand.nextInt(fortunes.length);
        System.out.println(fortunes[fr]);

        //10 program predict exponential growth giving population growth rate
        System.out.println("inter the actual population to predict");
        int pop = scan.nextInt();
        System.out.println("enter the rate of progression");
        double rate = scan.nextDouble();
        System.out.println("enter the time interval");
        int duration = scan.nextInt();

        System.out.format("%.2f",pop*Math.pow((1+rate),duration));

    }
}

