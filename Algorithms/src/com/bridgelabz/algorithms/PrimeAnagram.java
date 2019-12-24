package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram {
public static void main(String[] args) {
	Utility util=new Utility();
	System.out.println("Enter the number");
	int n=util.inputInteger();
	for(int i=2;i<=n;i++)
	{
		boolean p=prime(i);					//to check prime numbers between the range
		if(p)
		{
			int a=anagram(i);				//to find the product of the prime numbers
			int c=rev(i);					//to reverse prime number between the range
			int k=anagram(c);				//to find the product of the reversed prime number
			
			
			if(a==k)						//to print prime anagram numbers between the range
			{
				System.out.println(i);
			}
		}
	
	}
}
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
public static int anagram(int n)
{
	int prod=1,s=n;
	while(s!=0)
	{
		int r=s%10;
		prod=prod*r;
		s=s/10;
	}
	return prod;
}
public static int rev(int n)
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
