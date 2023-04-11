package BasicsJava;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Scanner;

public class ShutdownRestartPC {
    public static void main(String[] args) throws IOException {
        //attention this can shutdown your computer
        int choice;
        Runtime run = Runtime.getRuntime();
        System.out.println("what do you do :\n" +
                "shutdown you PC : press 1\n" +
                "Restart your PC : press 2\n" +
                "Log out         : press 3\n");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                try {
                    run.exec("shutdown /s");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    run.exec("shutdown /r");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    run.exec("shutdown /l");
                } catch (IIOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
