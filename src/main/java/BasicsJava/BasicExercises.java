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
        int number1, number2, result;
        System.out.println("please enter 1st number");
        number1 = scan.nextInt();
        System.out.println("please enter 2nd number");
        number2 = scan.nextInt();
        result = number1 + number2;
        System.out.println("the addition of the two numbers is " + result);
        
        
        //swap two numbers
        int numberA, numberB, temp;
        System.out.println("please enter 1st number");
        numberA = scan.nextInt();
        System.out.println("please enter 2nd number");
        numberB = scan.nextInt();
        System.out.printf("the numbers that you have choice are :\n number1 = %d\n number2 = %d \n", numberA, numberB);
        temp = numberB;
        numberB = numberA;
        numberA = temp;
        System.out.printf("the swaped numbers are \n number1 = %d \n number2 = %d \n", numberA, numberB);
        
        
        //largest number among 3 numbers
        int number_a, number_b, number_c, largest = 0;
        System.out.println("please enter 1st number ");
        number_a = scan.nextInt();
        System.out.println("please enter 2nd number ");
        number_b = scan.nextInt();
        System.out.println("please enter 3rd number ");
        number_c = scan.nextInt();
        if (number_a == number_c && number_b == number_a && number_a == number_b) {
            System.out.println("the three numbers are equal");
        } else if (number_a >= number_b && number_a >= number_c) {
            largest = number_a;
        } else if (number_b >= number_a && number_b >= number_c) {
            largest = number_b;
        } else if (number_c >= number_a && number_c >= number_b) {
            largest = number_c;
        }
        System.out.printf("the largest number among %d , %d and %d is %d", number_a, number_b, number_c, largest);
    }
}
