package com.bridgelabz.algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchWord {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		String st[]=new String[100];
		try {
		BufferedReader bf=new BufferedReader(new FileReader("E:\\test.txt"));
		String str;
		
		while((str=bf.readLine())!=null)
				{
			
			 st=str.split(",");
			
			
				}
		bf.close();
		}catch(Exception e)
		{
			System.out.println("File Error");
		}
		
		
		
		
		
		
		sort(st);
		disp(st);
		System.out.println("Enter the word to be searched");
		String s=sc.next();
		
		int b=binarySearch(st,s);
		if(b!=-1)
		System.out.println("Word found in the index : "+b);
		else
			System.out.println("Not Found");
	}
	//to check the binary search 
	public static int binarySearch(String st[],String x)
	{
		
		
		int l=0,r=st.length-1;
		while(l<=r)
		{
			int m=l+r/2;
			int res=x.compareTo(st[m]);
			if(res==0)
				return m;
			if(res>0)
				l=m+1;
			else
				r=m-1;
			
		}
		return -1;
	}
	//to sort the string array
	public static void sort(String st[])
	{
		int n=st.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(st[i].compareTo(st[j])>0)
				{
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
		
	
		
	}
	//to display the string array
	public static void disp(String st[])
	{
		for(int i=0;i<st.length;i++)
			if(i<st.length-1)
			System.out.print(st[i]+",");
			else
				System.out.println(st[i]);
	}
}
