package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pay off");
		double P=util.inputDouble();
		System.out.println("Enter the rate");
		double R=util.inputDouble();
		System.out.println("Enter the year");
		double y=util.inputDouble();
		
		pay(P, R, y);
		
	}
	//to calculate the monthly payment
	public static void pay(double P,double R,double y)
	{
		double n=12*y;
		double r=R/(12*100);
		//double payment=(P*r)/(1-pow(1+r,-n));
		double payment=(P*r)/(1-Math.pow(1+r, -n));
		double interest=payment*n-P;
		System.out.println("Payment="+payment);
		System.out.println("Interest="+interest);
	}
	//to calculate the power
	public static double pow(double n,double p)
	{
		double pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
