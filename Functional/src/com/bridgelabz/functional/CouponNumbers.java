package com.bridgelabz.functional;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CouponNumbers {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=util.inputInteger();
		int c=coupon(n);
		System.out.println(c);
	}
	//to generate the random coupon numbers
	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}
	//to count the coupon numbers
	public static int coupon(int n)
	{
		int c=0,i=0;
		boolean a[]=new boolean[n];

		while(i<n)
		{
			int rd=getCoupon(n);
			System.out.print(rd+" ");
			c++;
			if (!a[rd]) { 

				a[rd] = true;
				i++;
			}
		}

		return c;


	}
}

