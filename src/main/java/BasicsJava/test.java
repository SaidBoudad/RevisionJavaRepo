package BasicsJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inter the actual population to predict");
        int pop = scan.nextInt();
        System.out.println("enter the rate of progression");
        double rate = scan.nextDouble();
        System.out.println("enter the time interval");
        int duration = scan.nextInt();

        System.out.format("%.2f",pop*Math.pow((1+rate),duration));

    }
}
