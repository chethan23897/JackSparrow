package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
	public static void main(String[] args) {
		int c[]=read();
		disp(c);
		sort(c);
		System.out.println("Sorted array");
		disp(c);
		
	}
	//to read the elements to the array
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
	//to compute insertionsort
	public static void sort(int arr[]) 
	{ 
	    int n = arr.length; 
	    for (int i = 1; i < n; ++i) { 
	        int key = arr[i]; 
	        int j = i - 1; 

	        
	        while (j >= 0 && arr[j] > key) { 
	            arr[j + 1] = arr[j]; 
	            j = j - 1; 
	        } 
	        arr[j + 1] = key; 
	    } 
	}
}
