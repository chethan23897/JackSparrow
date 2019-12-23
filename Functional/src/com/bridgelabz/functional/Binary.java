package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=util.inputInteger();
		String b=decToBin(n);
		System.out.println("Binary representatin of "+n+" = "+b);
		
		int f=Integer.parseInt(b);
		int d=binToDec(f);
		System.out.println("Decimal representation of "+f+" = "+d);
	}
	//to convert decimal to binary
	public static String decToBin(int n)
	{
		String s="";
		do {
			int r=n%2;
			s=r+s;
			n=n/2;
		}while(n!=0);
		return s;
	}
	//to convert binary to decimal
	public static int binToDec(int n)
	{
		int c=0,dec=0;
		do {
			int r=n%10;
			dec=dec+r*pow(2,c);
			c++;
			n=n/10;
		}while(n!=0);
		return dec;
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
