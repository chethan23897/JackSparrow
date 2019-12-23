package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Harmonic {
public static void main(String[] args) {
	Utility util=new Utility();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=util.inputInteger();
	harmonic(n);
}
//to calculate the nth harmonic
public static void harmonic(int n)
{
	double hsum=0;
	for(double i=1;i<=n;i++)
	{
		hsum=hsum+1/i;
	}
	System.out.println("Harmonic = "+hsum);
}
}
