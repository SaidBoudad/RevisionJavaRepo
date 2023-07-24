package programs;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) throws InterruptedException {
        //1-read a sequence of integers from user and stop by displying message and the sum if it is greater than 100

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        //using while loop
        while (sum <= 100){
            System.out.print("enter a number :");
            try{
                sum += scan.nextInt();
            }catch (Exception e){
                System.out.println("enter a valid num");
                scan.next(); // Consume the invalid input to avoid infinite loop
            }

        }
        System.out.println("the sum is greater than 100  " + sum);
        //using do while loop
        do {
            System.out.print("enter a number :");
            try{
                sum += scan.nextInt();
            }catch (Exception e){
                System.out.println("enter a valid num");
                scan.next(); // Consume the invalid input to avoid infinite loop
            }

        } while (sum <= 100);
        System.out.println("the sum is greater than 100  " + sum);


        //2-display the sum of strict divisors of an integer given by the user
        System.out.print("enter an integer to find divisors sum : ");
        int intNumber = scan.nextInt();
        int sumDividors = 0;
        for (int i = intNumber/2; i>=1;i--)
            if (intNumber%i==0){
                sumDividors += i;
                System.out.println(i + "  ");
            }

        System.out.println("the sum of strict divisors is : "+ sumDividors);


        //3-read an integer from user and indicate if it is a prim or not
//        while (true) {
//            System.out.print("give me a positive number :");
//            int isItPrim = scan.nextInt();
//            int divisor = isItPrim / 2;
//            boolean isPrime = true;
//            if (isItPrim < 0)
//                System.out.println("this is a negative number , try another");
//            for (int i=1;i<isItPrim/2;i++){
//                if (isItPrim%2==0){
//                    isPrime = false;
//                }
//            }
//            System.out.println(( isPrime && isItPrim>0) ? "it's a prim" : "not a prim");
//            Thread.sleep(2000);
//        }


        //4-using the sum of divisors
//       while (true){
//            System.out.print("give me a positive number :");
//            int isItPrim = scan.nextInt();
//            int sum1 = 0;
//            if (isItPrim < 0)
//                System.out.println("this is a negative number , try another");
//            else {for (int i=1;i<isItPrim/2;i++){
//                    if (isItPrim%i==0)
//                        sum1 += i;
//                System.out.println(sum1);
//                }System.out.println(sum1==1 ? "prim" : "not a prim");
//            }
//        }


        //5-calculator
//        while (true){
//            System.out.println("enter number1 operator number2");
//            double a = scan.nextDouble();
//            char symb = scan.next().charAt(0);
//            double b = scan.nextDouble();
//            System.out.println(a +" "+symb+ " "+b );
//            switch (symb){
//                case '+':
//                    System.out.println(a+b);
//                    break;
//                case '-':
//                    System.out.println(a-b);
//                    break;
//                case '/':
//                    System.out.println( a/b);
//                    break;
//                case '*':
//                    System.out.println(a*b);
//                    break;
//                default:
//                    System.out.println("you enter false input");
//            }
//        }
//

        //6-Program that read sequance of positive integers and stop if the user fills negative value , and show the max and min of entred numbers
        System.out.println("enter a sequance of positive numbers : ");
        int a = scan.nextInt();
        int max = a;
        int min = a;
        if (a>=0){
            while (true) {
                a = scan.nextInt();
                if (a < 0)
                    break;
            //    if (a > max)
            //        max = a;
            //   else if (a < min)
            //       min = a;
                max = a > max ? a : max;
                min = a < min ? a : min;
            }
            System.out.println("the min is : "+min+" and the max is : "+max);
        }
        else System.out.println("invalid number");


    }

}

