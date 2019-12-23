package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=util.inputInteger();
		primeFactor(n);
	}
	//to print the prime factors of number
	public static void primeFactor(int n)
	{
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{

				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
		{
			System.out.println(n);
		}
	}
}
