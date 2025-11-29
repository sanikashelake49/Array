package com.revise.string;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="Sanika@12345 SheLake";
		 
		 int letters=0;
		 int digit=0;
		 int symbol=0;
		 int space=0;
		 
		 for(int i=0;i<str.length();i++){
			 char ch=str.charAt(i);
			 
			 if(Character.isLetter(ch)) {
				 letters++;
				 
			 }
			 else if(Character.isDigit(ch)) {
				 digit++;
			 }
			 else if(Character.isWhitespace(ch)) {
				 space++;
			 }
			 else 
				 symbol++;
			 
			 
		 }
		  System.out.println("letter "+letters);
		  System.out.println("digit "+digit);
		  System.out.println("space "+space);
		  System.out.println("symbol "+symbol);

	}

}
