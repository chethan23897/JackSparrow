package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySwapNibbles {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=util.inputInteger();
		String b=decToBin(n);
		System.out.println("Binary representatin of "+n+" = "+b);
		int l=swapNib(n);
		String c=decToBin(l);
		System.out.println("New digit is = "+c);
		System.out.println("New number is = "+l);
		
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
	//to swap the nibbles
	public static int swapNib(int n)
	{
		return ((n&0x0F)<<4|(n&0xF0)>>4);
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
