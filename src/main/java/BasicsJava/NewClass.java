package BasicsJava;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
       Integer number,remainder;
       System.out.println("please enter a number : ");
       Scanner scan = new Scanner(System.in);
       number = scan.nextInt();
       remainder = number % 2;
       System.out.println("number " + number + " is an " + (((number % 2) == 0) ? " even " : " odd ") + " number");
    }
}
