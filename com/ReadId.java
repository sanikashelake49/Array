package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadId {
	
	FileReader fr;
	BufferedReader br;

	public String  getId(){
		String data="";
		try {
			fr=new  FileReader("Id.txt");
			br=new BufferedReader(fr);
			
		    data=br.readLine();
		       
				
			
		 	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				br.close();
				fr.close();
	          }catch(IOException e){
	        	  e.printStackTrace();
	          }
		}
		return data;
		
	}

	 
}
