package com.revise.string;
import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println(str);
		
		//System.out.println(sc);

	}

	@Override
	public String toString() {
		return "ScannerString []";
	}

}
