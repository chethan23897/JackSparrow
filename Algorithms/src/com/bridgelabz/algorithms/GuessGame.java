package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GuessGame {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=util.inputInteger();
		int m=pow(2,n);
		System.out.println("Guess the number btw 0 to "+m);
		int secret=search(0,m);
		System.out.println("Your number is "+secret);
	}
	//to find the number between the range
	public static int search(int lo,int hi)
	{
		Scanner sc=new Scanner(System.in);
		if((hi-lo)==1)
			return lo;
		int mid=(lo+hi)/2; 
		System.out.println("Is the number less than "+mid);
		boolean s=sc.nextBoolean();
		if(s)
		return search(lo,mid);
		
			return search(mid,hi);
		
	}
	//to calculate the power
	public static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
