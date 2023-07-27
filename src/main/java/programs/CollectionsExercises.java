package programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsExercises {
    static Scanner scan = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        //1-print each item with it's index uniformly
        int[] arr = {1, 56, 852, 2, 36, 7};
        int count = 0;
        for (int num : arr) {
            System.out.printf(" %3d  %d", num, (count++));
            System.out.println();
        }

        //2-get from user 10  elements and sort and delete duplicate and print it ;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.print("enter 6 integers : ");
//        ArrayList<Integer> removed = new ArrayList<>();
//        for (int i=0;i<6;i++) {
//            int num = scan.nextInt();
//            if (!arrayList.contains(num))
//                arrayList.add(num);
//            else removed.add(num);
//        }
//        sortAndDisplayArrAndRemoved(arrayList,removed);
//
        //3-program that do the following options:
        //add element - remove element - display elements -exit
        ArrayList<String> arrayList1 = new ArrayList<>();
        boolean exit = true;
        while (exit) {
            displayMenu();
            int choice = scan.nextInt();
//            scan.nextLine();
            //or use
//            int choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    addElement(arrayList1);
                    break;
                case 2:
                    removeElement(arrayList1);
                    break;
                case 3:
                    displayElements(arrayList1);
                    break;
                case 4:
                    System.out.println("Bye");
                    exit = false;
                    break;
            }
        }

    }


    //2
    private static void sortAndDisplayArrAndRemoved(ArrayList<Integer> arrayList, ArrayList<Integer> removed) {
        Collections.sort(arrayList);
        System.out.println(arrayList + " revoved" + removed);
    }

    //3
    private static void displayMenu() {
        System.out.println("press the number of the option to choose from the list");
        System.out.print("1- add element \n" +
                "2- Remove element \n" +
                "3- Display elements \n" +
                "4- Exit the program\n" +
                "\n" +
                "\n" +
                "You choose : "
        );
    }

    private static void addElement(ArrayList<String> arrayList1) {
        System.out.println("enter the name you want to add : ");
        arrayList1.add(scan.next());
        System.out.println("Added");
        return;
    }

    private static void removeElement(ArrayList<String> arrayList1) {
        System.out.println("enter the element you want to remove : ");
        String toRemove = scan.next();
        if (arrayList1.contains(toRemove)) {
            arrayList1.remove(toRemove);
            System.out.println("Removed");
        } else System.out.println("Not found.");
    }

    private static void displayElements(ArrayList<String> arrayList1) {
        System.out.println("Your list is : " + arrayList1);
    }


}
