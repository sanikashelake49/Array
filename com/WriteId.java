package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteId {
	FileWriter fw;
	BufferedReader br;
	String id="";
	
	
	public void writeId(String id) {

		try {
			fw=new FileWriter("Id.txt");
			fw.write(id);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally
		{
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
