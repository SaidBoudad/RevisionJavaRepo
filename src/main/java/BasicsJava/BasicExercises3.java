package BasicsJava;

import java.util.Scanner;

public class BasicExercises3 {

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

        //3
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


    }
}
