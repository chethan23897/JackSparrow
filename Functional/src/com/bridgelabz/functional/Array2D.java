package com.bridgelabz.functional;

import java.io.OutputStreamWriter;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Array2D {
	public static void main(String[] args) {
		
		int c[][]=read();//initializing and reading elements to array
		disp(c);		//displaying the array to output
	}
	//Reading elements to the array
	public static int[][] read(){
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int m=util.inputInteger();
		int n=util.inputInteger();
		int a[][]=new int[m][n];
		System.out.println("Enter the"+" "+m*n+" "+"array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;

	}
	//to display the array
	public static void disp(int a[][])
	{
		//using PrintWriter with OutputStreamWriter to print the output to the screen. 
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		System.out.println("Entered array elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				pw.print(a[i][j]+" ");
			}
			pw.println(" ");
		}

	}
}
