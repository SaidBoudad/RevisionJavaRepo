package BasicsJava;

import java.util.*;

public class TicTacToeGame {
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args)  {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGame(gameBoard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement from 1 to 9");
            int playerPosition = scan.nextInt();
            while (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)) {
                System.out.println("Position is taken, try another");
                playerPosition = scan.nextInt();
            }

            placeChoice(gameBoard, playerPosition, "player");

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int cpuPosition = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)) {
                System.out.println("Position is taken, try another");
                cpuPosition = rand.nextInt(9) + 1;
            }

            placeChoice(gameBoard, cpuPosition, "CPU");
            printGame(gameBoard);
            System.out.println(checkWinner());

        }
    }

    public static void printGame(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char collomn : row) {
                System.out.print(collomn);
            }
            System.out.println();
        }
    }

    public static void placeChoice(char[][] gameBoard, int position, String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("CPU")) {
            symbol = 'O';
            cpuPositions.add(position);
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midlRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midlCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List crossA = Arrays.asList(1, 5, 9);
        List crossB = Arrays.asList(3, 5, 7);

        List<List> winningConditions = new ArrayList<>();
        winningConditions.add(topRow);
        winningConditions.add(midlRow);
        winningConditions.add(botRow);
        winningConditions.add(leftCol);
        winningConditions.add(rightCol);
        winningConditions.add(midlCol);
        winningConditions.add(crossA);
        winningConditions.add(crossB);

        for (List list : winningConditions) {
            if (playerPositions.containsAll(list)) {
                return "Congratulations you are the winning";
            } else if (cpuPositions.containsAll(list)) {
                return "CPU is the winning!\nTry again";
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "game over EQUAL \nTry again";
            }
        }
        return "";

    }

}
