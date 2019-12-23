package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
public static void main(String[] args) {
	Utility util=new Utility();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the day");
	int d=util.inputInteger();
	System.out.println("Enter the month");
	int m=util.inputInteger();
	System.out.println("Enter the year");
	int y=util.inputInteger();
	
	dayOfWeek(d, m, y);
	
}
//to calculate the day of week
public static void dayOfWeek(int d,int m,int y)
{
	int y1=y-(14-m)/12;
	int x=y1+(y1/4)-(y1/100)+(y1/400);
	int m1=m+12*((14-m)/12)-2;
	int m2=m;
	int d1=(d+x+((31*m1)/12))%7;
	String st[]= {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
	String st1[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	System.out.println("Month="+st[m2]);
	System.out.println("Day="+st1[d1]);
}
}
