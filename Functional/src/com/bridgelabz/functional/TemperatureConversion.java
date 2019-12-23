package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for fahrenheit conversion or Press 2 for celsius conversion");
		int n=util.inputInteger();
		System.out.println("Enter the temperature");
		double t=util.inputDouble();
		
		temp(n,t);
	}
	//to calculate the temperature conversion
	public static void temp(int n,double t)
	{
		if(n==1)
		{
			double temp=(t*9/5)+32;
			System.out.println("Fahrenheit="+temp);
		}else if(n==2)
		{
			double temp1=(t-32)*5/9;
			System.out.println("Celsius="+temp1);
		}
		else
		{
			System.out.println("Not applicable");
		}
}
}
