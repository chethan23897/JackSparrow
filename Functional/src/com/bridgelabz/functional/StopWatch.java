package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StopWatch {
//to calculate the elapsed time
	public static void main(String[] args) {
		Utility util=new Utility();
		String finish=new String();
		Scanner sc=new Scanner(System.in);
		boolean started=true;
		StopWatch stopWatch=new StopWatch();
		long time=0;
		long lastStart=System.currentTimeMillis();
		do{

				if(started){
					System.out.println("press N to stop");
					 finish=util.inputWord();
					if(finish.equals("N")){
						time=System.currentTimeMillis()-lastStart;
						System.out.println("Time is:"+(time/1000)+" Second");
						started=false;
					}
				}
				else{
					System.out.println("press Y to start");
					 finish=util.inputWord();
					if(finish.equals("Y")){
						lastStart=System.currentTimeMillis();
						started=true;
					}
					
				}
				System.out.println("Press C to continue");
				 finish=util.inputWord();
			
		}while(true);
	}
}

