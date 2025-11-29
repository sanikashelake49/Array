package com.revise.string;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="naman";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			//char ch=str.charAt(i);
			
		}
		System.out.println("reverse "+rev);
		
		if(rev.equals(str)) {
			System.out.println("it is pallindrome ");
		}
		else
			System.out.println("this is not pallindrome");
		
		
		//pallindrome using the array
		
		char ch[]=str.toCharArray();
		for(int i=0,j=ch.length-1;i<j;i++,j--) {
			
			char temp=ch[i];
			      ch[i]=ch[j];
			      ch[j]=temp;
			      
		}
		String reve="";
		
		for(int i=0;i<ch.length;i++) {
			reve+=ch[i];
			
		}
	System.out.println("reverse array "+reve);
	
	if(reve.equals(str)) {
		System.out.println("it is pallindrome");
	}
	else
		System.out.println("this is not pallindrome");
				
		
		
		
		

	}

}
