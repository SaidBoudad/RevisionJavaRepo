package BasicsJava;

import java.util.Scanner;

public class BasicExercises {
    public static void main(String[] args) {
        //1 exercise of even and odd
       int number;
       System.out.println("please enter a number : ");
       Scanner scan = new Scanner(System.in);
       number = scan.nextInt();
       System.out.println("number " + number + " is an " + (((number % 2) == 0) ? " even " : " odd ") + " number");
       //2 add two numbers
        int number1,number2,result;
        System.out.println("please enter 1st number");
        number1 = scan.nextInt();
        System.out.println("please enter 2nd number");
        number2 = scan.nextInt();
        result = number1 + number2;
        System.out.println("the addition of the two numbers is " + result);
    }
}
