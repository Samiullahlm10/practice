package com.sca.org;

import java.util.Scanner;

public class ScannerConcept {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = s.nextLine();
		
		System.out.println("Enter your First name");
		String fn = s.next();
		
		System.out.println("Enter your Initial");
		char initial = s.next().charAt(0);
	
		System.out.println("Enter your Age");
		int age = s.nextInt();
		
		System.out.println("Enter your Percentage");
		float per = s.nextFloat();
		
		System.out.println("Name :"+name);
		System.out.println("First Name :"+fn);
		System.out.println("Initial :"+initial);
		System.out.println("Age :"+age);
		System.out.println("Percentage :"+per);
	}

}
