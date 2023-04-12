package BasicsJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int numberone;
        System.out.println("please enter a number : ");
        Scanner scan = new Scanner(System.in);
        numberone = scan.nextInt();
        System.out.printf("the factroial of the number %d! is : %d",numberone,factorial(numberone));

    }
    public static int factorial(int n){
        if (n<=1){
            return 1;
        }else return n*factorial(n-1);
    }
}
