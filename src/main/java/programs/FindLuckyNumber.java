package programs;

import java.util.Scanner;

public class FindLuckyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a four digit number to see if they are lucky number");
            Integer num = scan.nextInt();
            String str = num.toString();
            if (!(str.length() == 4)) {
                System.out.println("this is not a four digit number, try again");
            }
            else {
                int d = (num % 10);
                int c = (num / 10) % 10;
                int b = (num / 100) % 10;
                int a = (num / 1000);
                if ((a + b) == (c + d))
                    System.out.println("great this is a lucky nuumber");
                else System.out.println("this is not a lucky number try another time");
            }
        }

    }
}
