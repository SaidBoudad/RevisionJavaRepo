package BasicsJava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //1 reversing a String using Array to hold the list of char and inverse it.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a list of character to reverse");
        String s = scan.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        char[] letters=new char[s.length()];
        int index =0;
        for (int i=s.length()-1;i>=0;i--){
            letters[index] = s.charAt(i);
            index++;
        }
        String reverse = "";
        for (int i=0;i<s.length();i++){
            reverse +=letters[i];
        }
        return reverse;
    }
}
