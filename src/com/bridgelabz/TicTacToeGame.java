package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;

//uc-1
public class TicTacToeGame {
    public static void main(String[] args){
        Scanner restart = new Scanner(System.in);
        String playagain;
        do {
            System.out.println("Welcome to Tic Tac Toe Game !");
            Scanner scanner = new Scanner(System.in);
            char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '},{' ', ' ', ' '}};
            chooseLetter();
            System.out.println("Empty Board");
            printBoard(board);
            getWinner();
            while (true) {
                playerTurn(board, scanner);
                if (isGameFinished(board)) {
                    break;
                }
                printBoard(board);
                computerTurn(board);
                if (isGameFinished(board)) {
                    break;
                }
                printBoard(board);
            }
            System.out.println("Play again : 1");
            System.out.println("exit : 2");
            playagain = restart.next();
        }while (playagain.equals("1"));
    }
    private static void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter ( X or O ) : ");
        char playerLetter = scanner.next().toUpperCase().charAt(0);
        char computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("computer choose :");
        System.out.println(computerLetter);
    }
    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
    private static void playerTurn(char[][] board,Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println(" choose a number (1 to 9) : ");
            userInput = scanner.nextLine();
            if(isValidMove(board,Integer.parseInt(userInput))){
                break;
            }else{
                System.out.println(userInput + "is not a valid move");
            }
        }
        placeMove(board, userInput, 'X');
    }
    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(9) + 1;
            if (isValidMove(board, computerMove)) {
                break;
            }
        }
        System.out.println("computer choose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }
    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("error");
        }
    }

    //uc-5
    private static boolean isValidMove(char[][] board, int position) {
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }
    private static boolean hasContestantWon(char[][] board,char symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)){
            return true;
        }
        return false;
    }
    public static boolean isGameFinished(char[][] board) {
        if (hasContestantWon(board, 'X')) {
            printBoard(board);
            System.out.println("Player wins!");
            System.out.println("Congratulations");
            return true;
        }
        if (hasContestantWon(board, 'O')) {
            printBoard(board);
            System.out.println("Computer wins!");
            System.out.println("You Loss the Game :(");
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }
    private static void getWinner() {
        if (((int) Math.random() * 10 % 2) == 0) {
            System.out.println("User won the toss");
        } else {
            System.out.println("Computer won the toss");
        }
    }
}
