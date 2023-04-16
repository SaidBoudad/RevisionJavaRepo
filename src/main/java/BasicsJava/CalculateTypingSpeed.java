package BasicsJava;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalculateTypingSpeed {
    public static void main(String[] args) throws InterruptedException {
        // program to calculate typing speed
        String text = "Although some people might advocate for typing out random words or short phrases" +
                " there are certain sentences that are particularly good for typing practice" +
                " One such sentence is The quick brown fox jumps over the lazy dog" +
                " This sentence uses every letter of the alphabet" +
                " making it a great way to warm up your fingers before embarking on a long typing session" +
                " Including a variety of sentences to practice typing" +
                " such as this one will provide a comprehensive foundation for your typing skills";
        String[] words = text.split(" ");
        System.out.println("Please write all words you see and tap entre after finishing");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[i + rand.nextInt(74)] + " ");
        }
        System.out.println();
        double start = LocalTime.now().toSecondOfDay();
        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();
        double end = LocalTime.now().toSecondOfDay();
        double tappingTime = end - start;

        int numberOfCharacters = typedWords.length();
        int wordsPerMinute = (int) ((numberOfCharacters / 5) / tappingTime) * 60;
        System.out.println(tappingTime + "   " + numberOfCharacters);
        System.out.println("your Words per minute is " + wordsPerMinute);

        //not finish in testing
        1111

    }
}
