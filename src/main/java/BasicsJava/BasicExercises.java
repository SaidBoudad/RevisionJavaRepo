package BasicsJava;

import java.math.BigInteger;
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
        
        
        //3 swap two numbers
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
        
        
        //4 largest number among 3 numbers by using if else
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
        } else largest = number_c;
        System.out.printf("the largest number among %d , %d and %d is %d", number_a, number_b, number_c, largest);

        //5 largest number among 3 numbers by using ternary operator
        int n1, n2, n3, largestNumber = 0;
        System.out.println("please enter 1st number ");
        n1 = scan.nextInt();
        System.out.println("please enter 2nd number ");
        n2 = scan.nextInt();
        System.out.println("please enter 3rd number ");
        n3 = scan.nextInt();
        if (n1 == n3 && n2 == n1 && n1 == n2) {
            System.out.println("the three numbers are equal");
        } else largestNumber = (n1>=n2 && n1>=n3 ? n1 : (n2>=n1 && n2>=n3 ? n2 : n3));
        System.out.printf("the largest number among %d , %d and %d is %d", n1, n2, n3, largestNumber);

        //6 program multiplalier from 1 to 10 any number given by user
        int num;
        System.out.println("enter a number");
        num = scan.nextInt();
        for (int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d \n",num,i,(num*i));
        }

        //7 find all divisors of a number
        int numToDivison=0;
        System.out.println("enter a number please");
        numToDivison = scan.nextInt();
        System.out.printf("the divisors of %d are : ",numToDivison);
        for (int i=1;i<=numToDivison/2;i++){
            if (numToDivison%i==0){
                System.out.printf(i +" , ");
            }
        }
        System.out.printf(numToDivison +" .");

        //8 factorial of number
        int Number;
        long factorial = 1;
        System.out.println("enter a number please");
        Number = scan.nextInt();
        if (Number < 0) {
            System.out.println("Sorry there is no factorial for negative numbers");
        } else if (Number >= 0) {
            for (int i = Number; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.printf("the factorial of %d! is %d", Number, factorial);
        }

        //9 fectorial of large number using BigInteger
        int Number1;
        BigInteger Factorial = BigInteger.ONE;
        System.out.println("enter a number please");
        Number1 = scan.nextInt();
        if (Number1 < 0) {
            System.out.println("Sorry there is no factorial for negative numbers");
        } else if (Number1 >= 0) {
            for (int i = Number1; i >= 1; i--) {
                Factorial = Factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.printf("the factorial of %d! is %d", Number1, Factorial);
        }
    

    }
}
