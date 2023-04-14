package BasicsJava;

import java.util.ArrayList;

public class FindPrimeNumbersBetweenTwoNumbers {
    //find prime numbers from a list of numbers
    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        System.out.printf("the prime numbers from the list : %d to %d are : \n", start, end);
        System.out.println( primeNumbers(start, end));
    }
    public static ArrayList<Integer> primeNumbers(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        int numberOfPrimes =0;
        for (int n = start; n <= end; n++) {
            boolean prime = true;
            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                primes.add(n);
                numberOfPrimes++;
            }
        }
        System.out.println("the total is " + numberOfPrimes);
        return primes;
    }
}

