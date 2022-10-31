package com.loop.org;

public class For {
	
	public static void main(String[] args) {
			
		for (int i = 3; i >= 1; i--) {
			for (int j = i; j < 3; j++) {
				System.out.print(" ");
			}
			
			char alpa='B';
			for (int a = 1; a <=i ; a++) {
				
				System.out.print(alpa+" ");
				alpa++;
			}
			System.out.println();
			
		}
	}

}
