package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Power2 {
public static void main(String[] args) {
	Utility util=new Utility();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=util.inputInteger();
	power(n);
}
//to calculate and print the power of 2
public static void power(int n)
{
	for(int i=0;i<=n;i++)
	{
		int p=pow(2,i);
		System.out.println("2^"+i+" = "+p);
	}
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
