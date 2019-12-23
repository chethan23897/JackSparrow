package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	static int note;
public static void main(String[] args) {
	Utility util=new Utility();
	System.out.println("Enter the amount");
	int amount=util.inputInteger();
	
	calculate(amount);
	System.out.println("Notes required is : "+note);
}
//to calculate the notes required to get change
public static void calculate(int amount)
{
	if(amount==0)
		return;
	if(amount>=1000)
	{
		note=amount/1000;
		System.out.println("1000 rs notes is : "+amount/1000);
		if(amount/1000==0)
			return;
		else
			calculate(amount%1000);
					
	}
	if(amount>=500)
	{
		note=amount/500;
		System.out.println("500 rs notes is : "+amount/500);
		if(amount/500==0)
			return;
		else
			calculate(amount%500);
					
	}
	if(amount>=200)
	{
		note=amount/200;
		System.out.println("200 rs notes is : "+amount/200);
		if(amount/200==0)
			return;
		else
			calculate(amount%200);
					
	}
	if(amount>=100)
	{
		note=amount/100;
		System.out.println("100 rs notes is : "+amount/100);
		if(amount/100==0)
			return;
		else
			calculate(amount%100);
					
	}
	if(amount>=50)
	{
		note=amount/50;
		System.out.println("50 rs notes is : "+amount/50);
		if(amount/50==0)
			return;
		else
			calculate(amount%50);
					
	}
	if(amount>=20)
	{
		note=amount/20;
		System.out.println("20 rs notes is : "+amount/20);
		if(amount/20==0)
			return;
		else
			calculate(amount%20);
					
	}
	if(amount>=10)
	{
		note=amount/10;
		System.out.println("10 rs notes is : "+amount/10);
		if(amount/10==0)
			return;
		else
			calculate(amount%10);
					
	}
	if(amount>=5)
	{
		note=amount/5;
		System.out.println("5 rs notes is : "+amount/5);
		if(amount/5==0)
			return;
		else
			calculate(amount%5);
					
	}
	if(amount>=2)
	{
		note=amount/2;
		System.out.println("2 rs notes is : "+amount/2);
		if(amount/2==0)
			return;
		else
			calculate(amount%2);
					
	}
	if(amount>=1)
	{
		note=amount/1;
		System.out.println("1 rs notes is : "+amount/1);
		if(amount/1==0)
			return;
		else
			calculate(amount%1);
					
	}
}
}
