package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class PrimePalindrome {
	public static void main(String[] args) {
		Utility util=new Utility();
		System.out.println("Enter the number");
		int n=util.inputInteger();
		for(int i=2;i<=n;i++)
		{
			boolean p=prime(i);					//to check prime numbers between the range
			if(p)
			{
				int c=pali(i);					//to reverse the number for given range
				
				if(i==c)						//to check palidrome prime between the range
				{
					System.out.println(i);
				}

			}
		}	
	}
	//to compute prime number or not
	public static boolean prime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
	//to reverse number
	public static int pali(int n)
	{
		int reversed=0,s=n;
		while(s != 0) {
			int digit = s % 10;
			reversed = reversed * 10 + digit;
			s =s/ 10;
		}
		return reversed;
	}
}
