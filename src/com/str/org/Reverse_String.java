package com.str.org;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String s="Hello World";
		
		String[] split = s.split("");
		
		for (int i = split.length-1; i >= 0; i--) {
			
			System.out.print(split[i]);
			
		}
		
	}

}
