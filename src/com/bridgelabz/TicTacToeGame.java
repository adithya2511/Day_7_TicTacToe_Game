package com.bridgelabz;
import java.util.Scanner;
//uc-1
public class TicTacToeGame {
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '},{' ', ' ', ' '}};
    public static char chooseLetter;
    //uc-2
    public static void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter ( X or O ) : ");
        char playerLetter = scanner.next().toUpperCase().charAt(0);
        char computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("computer choose :");
        System.out.println(computerLetter);
    }
    //uc-3
    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
    //uc-4
    private static void playerTurn(String userInput) {
        switch (userInput){
            case "1" :
                board[0][0] = 'X';
                break;
            case "2" :
                board[0][1] = 'X';
                break;
            case "3" :
                board[0][2] = 'X';
                break;
            case "4" :
                board[1][0] = 'X';
                break;
            case "5" :
                board[1][1] = 'X';
                break;
            case "6" :
                board[1][2] = 'X';
                break;
            case "7" :
                board[2][0] = 'X';
                break;
            case "8" :
                board[2][1] = 'X';
                break;
            case "9" :
                board[2][2] = 'X';
                break;
            default:
                System.out.println("error");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        chooseLetter();
        printBoard(board);
        //uc-4
        Scanner scanner = new Scanner(System.in);
        System.out.println(" choose a number (1 to 9) : ");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        playerTurn(userInput);
        printBoard(board);
    }
}

