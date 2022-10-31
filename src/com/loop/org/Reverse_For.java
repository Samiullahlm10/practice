package com.loop.org;

public class Reverse_For {
	
	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a < i; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
