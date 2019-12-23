package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindTriplets {
public static void main(String[] args) {
	int c[]=read();
	disp(c);
	int n=c.length;
	findTriplets(c,n);
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
	System.out.println("Entered array elements are");
	for(int i=0;i<a.length;i++)
	{
		if(i<a.length-1)
		System.out.print(a[i]+",");
		else
			System.out.println(a[i]);
			
	}
}
//to calculate the tripplets in the array
public static void findTriplets(int[] a, int n) 
{ 
	int c=0;
    boolean found = true; 
    for (int i=0; i<n-2; i++) 
    { 
        for (int j=i+1; j<n-1; j++) 
       { 
            for (int k=i+2; k<n; k++) 
           { 
                if (a[i]+a[j]+a[k] == 0) 
                { 
                	System.out.println("Tripplets are");
                    System.out.println(a[i]+" "+a[j]+" "+a[k]); 
                    
                    c++;
                  
                    
                } 
            } 
        } 
    } 
  
    if (found == false) 
        System.out.println(" not exist "); 
  System.out.println("No of tripplets are "+c);
} 
}
