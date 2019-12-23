package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TicTacToeMain {
	public static void main(String[] args) {
		TicTacToe tic=new TicTacToe();
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> al=new ArrayList<Character>();
		int counter=0;
		String player1="",player2="";
		char player1Marker,player2Marker;
		char choice=' ';




		//to initialize board
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				tic.board[i][j]=Character.forDigit(++counter,10);
			}
		}
		//display board
		tic.disp(tic.board);

		//to enter player1 name
		System.out.println("Enter the player 1 name :");
		player1=util.inputWord();

		//to enter player2 name
		System.out.println("Enter the player 2 name :");
		player2=util.inputWord();

		//to enter player1 marker
		System.out.println(player1+" Select Marker(X or O):");
		player1Marker=sc.nextLine().charAt(0);

		//to check marker
		if(player1Marker!='X' && player1Marker!='x' && player1Marker!='O' && player1Marker!='o')
		{
			System.out.println("Invali....Enter the correct marker");
			player1Marker=sc.nextLine().charAt(0);
		}
		//to assign marker to another player
		if(player1Marker=='X'||player1Marker=='x')
		{
			player2Marker='O';
		}
		else
		{
			player2Marker='X';

		}

		//to take user choice
		for(int i=0;i<4;i++)
		{
			//player 1 choice
			System.out.println(player1+ " Enter your choice : ");
			choice=sc.next().charAt(0);

			//to check whether position Empty or Not
			if(al.contains(choice))
			{
				System.out.println("Already selected...choose other position..");
				choice=sc.next().charAt(0);
			}
			else
			{
				al.add(choice);
			}

			//replace fuction to set the mark
			tic.replace(tic.board, choice, player1Marker);
			tic.disp(tic.board);
			if(i>=2)
			{
				if(tic.checkForWin())
				{
					System.out.println(player1+ " Won the Game....");
					return;

				}
			}

			//player 2 choice
			System.out.println(player2+ " Enter your choice : ");
			choice=sc.next().charAt(0);

			//to check whether position Empty or Not
			if(al.contains(choice))
			{
				System.out.println("Already selected...choose other position..");
				choice=sc.next().charAt(0);
			}
			else
			{
				al.add(choice);
			}

			//replace fuction to set the mark
			tic.replace(tic.board, choice, player2Marker);
			tic.disp(tic.board);

			if(i>=2)
			{
				if(tic.checkForWin())
				{
					System.out.println(player2+ " Won the Game....");
					return;

				}
			}
		}
		//upper loop runs for 8 times but board contains 9 position
		System.out.println(player1+" Enter the choice : ");
		choice=sc.next().charAt(0);

		//to check whether position Empty or Not
		if(al.contains(choice))
		{
			System.out.println("Already selected...choose other position..");
			choice=sc.next().charAt(0);
		}
		else
		{
			al.add(choice);
		}

		tic.replace(tic.board, choice, player1Marker);
		tic.disp(tic.board);
		if(tic.checkForWin())
		{
			System.out.println(player1+ " Won the Game....");
		}
		else
		{
			System.out.println("Match Draw....");
		}

	}
}

