package programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
         //1 reversing a String directly
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a list of character to reverse");
        String s = scan.nextLine();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("the reverse fo the given characters is " + reverse);

        //2 reversing a String using Array to hold the list of char and inverse it.
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
