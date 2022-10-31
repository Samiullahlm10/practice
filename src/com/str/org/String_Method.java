package com.str.org;

public class String_Method {

	
	public static void main(String[] args) {
		
		String s="Java";
		String s1="Sel enium";
		String s2="Phyton";
		
		
		int length = s.length();
		System.out.println(length);

		boolean equals = s.equals(s2);
		System.out.println(equals);
	
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
	
		int lastIndexOf = s.lastIndexOf("a");
	    System.out.println(lastIndexOf);
		
	    char charAt = s.charAt(0);
	    System.out.println(charAt);
	    
	    String[] split = s1.split(" ");
	    for (String str : split) {
	    	
	    	System.out.println(str);
			
		}
	
	
	}
}
