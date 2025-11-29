package com.revise.string;

public class Vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sanika Shelake";
		
	      int vowels=0;
		  int consonent=0;
		  
		  for(int i=0;i<str.length();i++) {
			  char ch=str.charAt(i);
		  
		  if(ch>='a' && ch<='z') {
			  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
				  vowels++;
				  
			  }
			  else
				  consonent++;
		  }
		  
		  }
		  System.out.println("vowels "+vowels);
		  System.out.println("consonents "+consonent);
		  
		
		
		

	}

}
