package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double c=util.inputDouble();
		sqrt(c);
		
	}
	//to calculate the square using Newton's method 
	public static void sqrt(double c)
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println("Sqrt="+t);
		
	}
}
