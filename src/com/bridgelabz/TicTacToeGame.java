package com.bridgelabz;
import java.util.Scanner;

public class TicTacToeGame {
    static char [] board = new char[10];
    private static void createEmptyBoard(char[] board) {
        for(int i = 1; i < board.length;i++) {
            board[i] = ' ';
        }
    }
    private static void chooseLetter(char[] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter ( X or O ) : ");
        char playerLetter = scanner.next().toUpperCase().charAt(0);
        char computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("computer choose :");
        System.out.println(computerLetter);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        createEmptyBoard(board);
        chooseLetter(board);
    }
}

