package BasicsJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("hwo many stars do you want in the pattern");
        int numberOfStars = scan.nextInt();
        for (int i=1;i<=numberOfStars;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=numberOfStars-1;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
