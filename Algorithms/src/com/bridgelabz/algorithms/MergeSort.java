package com.bridgelabz.algorithms;



import java.util.Scanner;

import com.bridgelabz.utility.Utility;



public class MergeSort {
	public static void main(String[] args) {

		String c[]=read();
		System.out.println("Entered array elements");
		disp(c);
		int	n=c.length;
		mergeSort(c,0,c.length-1);
		System.out.println("Sorted array");
		disp(c);

	}
	//to initialize and read elements to array
	public static String[] read()
	{
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=util.inputInteger();
		String a[]=new String[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		return a;
	}
	//to display the array
	public static void disp(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1)
				System.out.print(a[i]+",");
			else
				System.out.println(a[i]);

		}
	}
	//to compute mergesort of string array
	public static void mergeSort(String[] a, int from, int to) {
		if (from == to) {
			return;
		}
		int mid = (from + to) / 2;
		mergeSort(a, from, mid);
		mergeSort(a, mid + 1, to);
		merge(a, from, mid, to);
	}
	//to merge the string array
	public static void merge(String[] a, int from, int mid, int to) {

		int n = to - from + 1;              
		String[] b = new String[n];
		int i1 = from;               
		int i2 = mid + 1;            
		int j = 0;                   

		while (i1 <= mid && i2 <= to) {
			if (a[i1].compareTo(a[i2]) < 0) {
				b[j] = a[i1];
				i1++;
			} else {
				b[j] = a[i2];
				i2++;
			}
			j++;
		}

		while (i1 <= mid) {
			b[j] = a[i1];
			i1++;
			j++;
		}

		while (i2 <= to) {
			b[j] = a[i2];
			i2++;
			j++;
		}

		for (j = 0; j < n; j++) {
			a[from + j] = b[j];
		}
	}

}
