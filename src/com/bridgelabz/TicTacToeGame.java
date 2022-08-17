package com.bridgelabz;

public class TicTacToeGame {
    static char [] board = new char[10];
    private static void createEmptyBoard(char[] board)
    {
        for(int i = 1; i < board.length;i++)
        {
            board[i] = ' ';
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        createEmptyBoard(board);
    }
}

