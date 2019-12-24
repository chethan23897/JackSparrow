package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Utility {
	BufferedReader bufferedReader,br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "01/01/2016";
	
	//constructor to initalize bufferedReader
	public Utility(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	//take input word
	public String inputWord(){
		try{
			return bufferedReader.readLine();
		}
		catch(IOException exception){
			System.out.println(exception.getMessage());
		}
		return "";
	}

	//Take Integer Input
	public int inputInteger(){
		 
			try{
				try{	
					return Integer.parseInt(bufferedReader.readLine());
				}
				catch(NumberFormatException exception){
					System.out.println(exception.getMessage());	
				}
			}catch(IOException exception){
				System.out.println(exception.getMessage());
			}
		return 0;
	}

	//Take Double Input
	public double inputDouble(){
		 
			try{
				try{	
					return Double.parseDouble(bufferedReader.readLine());
				}
				catch(NumberFormatException exception){
					System.out.println(exception.getMessage());	
				}
			}catch(IOException exception){
				System.out.println(exception.getMessage());
			}
		return 0.0;
	}

	//Take number of random number to genrate as input and return array of random number
	public int[] getRandomArray(int number){
		Random randomGenerator = new Random();
		int array[]=new int[number];
		for(int i=0;i<number;i++){
			array[i]=randomGenerator.nextInt();
		}
		return array;
	}

	

	//Function take String in dd/MM/yyyy format and return Date Object
	public Date stringToDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException parseException){
			return null;
		}
	}

	//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	//Take file name as input and return string of file text
	public String getFileText(String fileName){

		try{

			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception exception){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException exception){
			}	
		}
	}
	
	//this function take two parameter 
	// 1 what data to write.
	// 2 file name
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
       // Writes the content to the file
       writer.write(data); 
       writer.flush();
       writer.close();
	}

	public void printMap(Map mp) {
    		Iterator it = mp.entrySet().iterator();
    		while (it.hasNext()) {
        		Map.Entry pair = (Map.Entry)it.next();
        		System.out.println(pair.getKey() + " = " + pair.getValue());
    		}
	}
}
