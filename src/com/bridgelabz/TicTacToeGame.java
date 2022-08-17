package com.bridgelabz;
import java.util.Scanner;

public class TicTacToeGame {
    static char[][] board = {{'1', '2', '3'}, {'4', '5', '6'},{'7', '8', '9'}};

    public static void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter ( X or O ) : ");
        char playerLetter = scanner.next().toUpperCase().charAt(0);
        char computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("computer choose :");
        System.out.println(computerLetter);
    }
    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        chooseLetter();
        printBoard(board);
    }
}

