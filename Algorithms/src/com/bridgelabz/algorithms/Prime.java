package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Prime {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=util.inputInteger();
		//to print prime numbers between the range
		for(int i=2;i<=n;i++)
		{
			boolean s=prime(i);
			if(s)
			{
				System.out.println(i);
			}
		}
	}
	//to compute prime numbers
	public static boolean prime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
