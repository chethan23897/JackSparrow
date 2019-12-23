package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		double a=util.inputDouble();
		System.out.println("Enter the value for b");
		double b=util.inputDouble();
		System.out.println("Enetr the value for c");
		double c=util.inputDouble();
		quad(a, b, c);

	}	
	//to calculate the quadratic equation and print the roots
public static void quad(double a,double b,double c)
{
		double root1=0,root2=0;
		double delta=b*b-4*a*c;
		double sqrt=sqrt(delta);
		if(delta>0)
		{
			root1=(-b+sqrt)/(2*a);
			root2=(-b-sqrt)/(2*a);
			System.out.println("Roots are:"+root1+" and "+root2);
		}else if(delta==0)
		{
			System.out.println("Root="+(-b+sqrt)/(2*a));
		}


	}
	//to calculate the square root
	public static double sqrt(double n)
	{
		double t;
		double s=n/2;
		do {
			t=s;
			s=(t+(n/t))/2;

		}while(t-s!=0);
		return s;
	}
}
