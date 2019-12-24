package com.bridgelabz.lib;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=util.inputWord();
		System.out.println("Enter the second string"); 
		String str2=util.inputWord();
		
		boolean p=anagram(str1,str2);
		if(p)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not ANagaram");
		}
		
		
		
	}
	//to check two strings are anagram or not
	public static boolean anagram(String str1,String str2)
	{
		int count1[]=new int[26];
		if(str1.length()!=str2.length())
		{
			return false;
		}
		for(int i=0;i<str1.length();i++)
		{
			char ch1=str1.charAt(i);
			if(ch1>='A'&&ch1<='Z')
			{
				count1[ch1-65]++;
			}
			else if(ch1>='a'&&ch1<='z')
			{
				count1[ch1-97]++;
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			char ch2=str2.charAt(i);
			if(ch2>='A'&&ch2<='Z')
			{
				count1[ch2-65]--;
			}
			else if(ch2>='a'&&ch2<='z')
			{
				count1[ch2-97]--;
			}
		}

		for(int i=0;i<count1.length;i++)
		{
			if(count1[i]!=0)
			{
				return false;
			}
		}
		return true;
		
	}
}
