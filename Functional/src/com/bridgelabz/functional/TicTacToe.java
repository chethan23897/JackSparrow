package com.bridgelabz.functional;

import java.util.ArrayList;

public class TicTacToe {
	private final static int ROWS = 3;
	private final static int COLMS = 3;
	public static char[][] board = new char[ROWS][COLMS];
	
	

	//to display the board
	public static void disp(char[][] board) {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLMS; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

	//to replace the choice with marker
	public static void replace(char board[][], int find, char mark) {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLMS; j++) {
				if (board[i][j] == find) {
					board[i][j] = mark;
					return;
				}
			}
		}
	}

	//to check for win
	public static boolean checkForWin()
	{
		return(checkForRow()||checkForCol()||checkForDiagonal());
	}
	//to check for diagonal
	public static boolean checkForDiagonal() {
		return ((check(board[0][0],board[1][1],board[2][2])==true)||(check(board[0][2],board[1][1],board[2][0])==true));
	}
	//to check for column
	public static boolean checkForCol() {
		for(int i=0;i<COLMS;i++)
		{
			if(check(board[0][i],board[1][i],board[2][i])==true)
				return true;
		}
		return false;
	}
	//to check for row
	public static boolean checkForRow() {
		for(int i=0;i<ROWS;i++)
		{
			if(check(board[i][0],board[i][1],board[i][2])==true)
				return true;
		}
		return false;
	}
	//check function
	public static boolean check(char c1, char c2, char c3) {
		return ((c1==c2)&&(c2==c3));
	}

}
