package programs;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        //1-program gives sum of digits of an integer read from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer to give you the sum of it's digits : ");
        int num = scan.nextInt();
        int sum = 0;
        while (num>0){
            int a = num % 10 ;
            sum +=a;
            num /= 10;
        }
        System.out.println("the sum of digits is : "+sum);


        //2-program that read an integer from user and display the n number of the fibonacci sequence
        System.out.println("enter a number of fibonacci sequence numbers to display : ");
        int n = scan.nextInt();
        if(n==1)
            System.out.print(1);
        if (n>=2)
            System.out.print(1 +"-"+ 1);
        int a = 1;
        int b = 1;
        int c = 0 ;
        for (int i=3;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print("-"+c);
        }
        System.out.println(" the "+n+" fibonacci number is "+c);

        //3-displays a string with space after each character
        System.out.print("please enter a String : ");
        String str = scan.nextLine();
        for (int i=0;i<=str.length()-1;i++){
            System.out.print(str.charAt(i)+" ");
        }

        //4-displays the reverse of a string
        System.out.print("please enter a String : ");
        String str1= scan.nextLine();
        String rev ="";
        for (int i=str1.length()-1; i>=0;i--)
            rev += str1.charAt(i);
        System.out.println("reverse :"+rev);

        //5-find if a given string is a palindrome or not
        System.out.print("please enter a String : ");
        String str2 = scan.nextLine();
        int leng = str2.length()-1;
        boolean isPal = true;
        //first way decrementing j/leng after each iteration
        for (int i=0;i<leng/2;i++){
            if(str2.charAt(i)!= str2.charAt(leng)){
                isPal = false;
            }
            leng -= 1;
        }
        System.out.println(isPal ? "is a palindrome" : "not a palindrome");
        //second way two variable inside for loop
        for (int i=0,j=str2.length()-1;i<j;i++,j--){
            if (str2.charAt(i)==str2.charAt(j))
                continue;
            isPal =false;
            break;
        }
        System.out.println(isPal ? "palindrome" : "not");

        //6-read an integer n and display numbers in n rows from 1time in row 1 to n time in row n;
        System.out.println("enter an integer to give you the rows of it till n rows : ");
        int num1 = scan.nextInt();    //1
        for (int i=1; i<=num1;i++){   //22
            for (int j=1; j<=i;j++)   //333
                System.out.print(i);  //4444
            System.out.println();     //nnnnn
        }

        //7-read an integer n and display * in n rows from 1time in row 1 to n time in row n;
        System.out.println("enter an integer to give you the rows of * till n rows : ");
        int num2 = scan.nextInt();       //   * n=4
        int d = num2;                    //  **
        for (int i=1;i<=num2;i++){       // ***
            a--;                         //****
            for (int j=1;j<=num2;j++)
                System.out.print(j>d ? ("*") : (" "));
            System.out.println();
        }
        //another way
        for (int i=1;i<=num2;i++){
            for(int j=1;j<=num2-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        //n=4
        //    *
        //   ***
        //  *****
        // *******
        for (int i=1;i<=num2;i++){
            for(int j=1;j<=num2-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int j=1;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
        //another way
        for (int i=1;i<=num2;i++){
            for(int j=1; j <= num2-i ; j++)
                System.out.print(" ");
            for(int j=1 ; j <= 2*i-1 ; j++) //2*i-1 the relation between number of lines and the number of starts
                System.out.print("*");
            System.out.println();
        }

        //8-read an integer n and display * in this way
        // n=3  *       n=4 *
        //     * *         * *
        //    *****       *   *
        //               *******
        System.out.println("enter an integer to give you the rows of * till n rows : ");
        int num3 = scan.nextInt();
        for (int i = 1; i <= num3; i++) {
            for (int j = 1; j <= num3 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) { //2*i-1 the relation between number of lines and the number of starts
                if (i == num3) System.out.print("*");
                else if (j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        //9-read an integer n and display stars in this way
        //n=3 ***  n=4 ****
        //    * *      *  *
        //    ***      *  *
        //             ****
        System.out.println("enter an integer to give you the rows of * till n rows : ");
        int num4 = scan.nextInt();
        for (int i = 1; i <= num4; i++) {
            for (int j = 1; j <= num4; j++) {
                if (i == 1 || i == num4) System.out.print("*");
                else {
                    if (j == 1 || j==num4)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
