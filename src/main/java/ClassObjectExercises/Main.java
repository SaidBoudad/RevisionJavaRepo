package ClassObjectExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

//        Rectangle rect =new Rectangle();
//        System.out.println(rect.getWidth()+" "+ rect.getHight());
//        rect.setHight(2);
//        rect.setWidth(3);
//        System.out.println(rect);
//        System.out.println(rect.getArea());
//        System.out.println(rect.getPerimeter());
//
//        printTheArrRectangleAttributes(getTheArrRectangles());



        Client clientSaid = new Client(1,"said","0633736058");
        Client clientSamira = new Client(222,"samira","055736058");

        Account testAccount = new Account(11,20000,5,clientSaid);
        Account testAccount2 = new Account(111,40000,5,clientSaid);
        Account account1 = new Account(22,2000,0.05,clientSamira);
        Account account2 = new Account(222,20000,0.05,clientSamira);
        Account account3 = new Account(2222,30000,0.05,clientSamira);

        System.out.println(account2.getBalance());
        testAccount.withdraw(20000);
        testAccount.deposit(3000);
        System.out.println(testAccount.getID()+ " " +
                testAccount.getBalance()+" "+
                testAccount.getDateCreated().toGMTString());
        account3.withdraw(250);
        System.out.println(testAccount.getBalance());

        ArrayList<Client> clientList = new ArrayList<>();
        clientList.add(clientSaid);
        clientList.add(clientSamira);

        clientList.get(0).addAccount(testAccount);
        clientList.get(0).addAccount(testAccount2);
        clientList.get(1).addAccount(account1);
        clientList.get(1).addAccount(account2);
        clientList.get(1).addAccount(account3);

        System.out.println(clientList.get(0).toString());
        System.out.println(clientList.get(1).toString());


    }

    private static Rectangle[] getTheArrRectangles() {
        Rectangle[] arrRect = new Rectangle[3];
        for (int i=0;i<arrRect.length;i++){
            System.out.println("enter the width and the hight of 3 rectangles");
            arrRect[i]=new Rectangle(scanner.nextInt(),scanner.nextInt());
        }return arrRect;
    }
    private static void printTheArrRectangleAttributes(Rectangle[] theArrRectangles) {
        for (Rectangle rec:theArrRectangles)
            System.out.println(rec.getHight()+" "+rec.getWidth());
    }


}
