package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Euclidean {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		double x=util.inputDouble();
		System.out.println("Enter the value for b");
		double y=util.inputDouble();
		dist(x,y);
		
		
	}
	//to calculate the euclidean distance for origin(0,0)
	public static void dist(double x,double y)
	{
		double dist=0;
		double x1=Math.pow(x, 2);
		double y1=Math.pow(y, 2);
		dist=sqrt(x1+y1);
		System.out.println("Distance="+dist);
		
}
	//to calculate the square root
	public static double sqrt(double n)
	{
		double t;
		double s=n/2;
		do {
			t=s;
			s=(t+(n/t))/2;
		}while((t-s)!=0);
		return s;
	}
}
