package com.bridgelabz.algorithms;

import java.util.Date;

import com.bridgelabz.utility.Utility;



public class ReadMessage {
private static String STR=
		   "Hello <<name>>, We have your full name as <<full name>> in our system.\r\n"
+"Your contact number is 91-xxxxxxxxxx.\r\n"
+"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";







public static void main(String[] args) {
	Utility util=new Utility();
	UserDetails rm=new UserDetails();
	System.out.println("Enter FirstName:");
	rm.setfName(util.inputWord());
	
	System.out.println("Enter LastName:");
	rm.setlName(util.inputWord());

	String fulname=rm.fName+rm.lName;
	System.out.println("Enter MobileNumber:");
	rm.setmobileNo(util.inputWord());
	
	//Setting Currrent date
	rm.setdate(util.getFormatedDate(new Date()));
	
	STR=STR.replaceAll("<<name>>",rm.fName);
	STR=STR.replaceAll("<<full name>>",rm.fName+" "+rm.lName);
	STR=STR.replaceAll("91-xxxxxxxxxx",rm.mobileNo);
	STR=STR.replaceAll("01/01/2016",rm.date);
	System.out.println("------------------");
	System.out.println(STR);
}
}
