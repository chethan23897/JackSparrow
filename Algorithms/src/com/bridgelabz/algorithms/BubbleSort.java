package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		int c[]=read();
		disp(c);
		bubbleSort(c);
		System.out.println("Sorted array is");
		disp(c);
	}
	//to initialize and read elements to array
	public static int[] read()
	{
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=util.inputInteger();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	//to display the array
	public static void disp(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1)
			System.out.print(a[i]+",");
			else
				System.out.println(a[i]);
				
		}
	}
	//to compute bubblesort
	public static void bubbleSort(int a[])
	{
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
	}
}
