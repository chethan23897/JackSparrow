package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Leap {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=util.inputInteger();
		boolean l=leap(n);
		if(l)
		{
			System.out.println("Leap year");
		}else
		{
			System.out.println("Not leap year");
		}
	}	
	//to check given year is leap year or not
	public static boolean leap(int n)
	{
		if(n>=1582)
		{
			if(n%4==00&&n%100!=0)
				return true;
			else
			{
				if(n%400==0)
					return true;
			}
		}
		return false;
	}
}
