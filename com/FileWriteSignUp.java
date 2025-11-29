package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriteSignUp {

   FileWriter fw;
   BufferedReader br;
   InputStreamReader isr;
   ReadId re=new ReadId();
   WriteId wi=new WriteId();
   
   
   void getwriteData() {
	   
	   try {
		   fw=new FileWriter("custDetail.txt",true);
		   br=new BufferedReader(new InputStreamReader(System.in));
		   
		  
		   int  id=Integer.parseInt(re.getId());
		   ++id;
		   System.out.println("custId is "+String.valueOf(id));
		   System.out.println("first name");
		   String fn=br.readLine();
		   System.out.println("last name");
		   String ln=br.readLine();
		   System.out.println("passward");
		   String pass=br.readLine();
		   System.out.println("enter mobile no");
		   String mbno=br.readLine();
		   System.out.println("enter age");
		   String age=br.readLine();
		   System.out.println("minbalnace");
		   String minbl=br.readLine();
		   
		 //It show the id that was auto generated
			System.out.println("your customer / reference id is " +id);
			
			//it help to convert int(type) into the String(type)
			fw.write(String.valueOf(id));
			fw.write("#");
			fw.write(fn);
			fw.write("#");
			fw.write(ln);
			fw.write("#");
			fw.write(pass);
			fw.write("#");
			fw.write(mbno);
			fw.write("#");
			fw.write(age);
			fw.write("#");
			fw.write(minbl);
			fw.write("\n");
			//here we write the latest auto generated value into the ID.txt file
			wi.writeId(String.valueOf(id));

		   
	   }catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				br.close();//first close br then close fw.
				fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
   }
}
    

