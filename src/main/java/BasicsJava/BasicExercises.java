package BasicsJava;

import java.util.Scanner;

public class BasicExercises {
    public static void main(String[] args) {
        //1 exercise of even and odd 1push
       int number;
       System.out.println("please enter a number : ");
       Scanner scan = new Scanner(System.in);
       number = scan.nextInt();
       System.out.println("number " + number + " is an " + (((number % 2) == 0) ? " even " : " odd ") + " number");
    }
}
