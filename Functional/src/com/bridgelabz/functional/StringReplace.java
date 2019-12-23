package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringReplace {

public static final String STR="Hello UserName, How are you?";

public static void main(String args[]){
	Utility util=new Utility();
	String s=new String();
	do{
		System.out.println("Enter The UserName: ");
		s=util.inputWord();
	}while(checkLength(s));

	System.out.println("----Replaced String----");

	stringReplacer(s);		
	
}

//Checking lenth of the User Name
public static boolean checkLength(String s){
	if(s.length()<3){
		System.out.println("UserName lenght should grater then 3");
		return true;
	}
	else{
		return false;
	}
}

//Replace the template by UserName
public static void stringReplacer(String s){
	System.out.println(STR.replaceAll("UserName",s));
}
}
