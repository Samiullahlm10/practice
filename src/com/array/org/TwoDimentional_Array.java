package com.array.org;

public class TwoDimentional_Array {
	
	public static void main(String[] args) {
		
		int a[][]= {{10,20,30,40,50},{60,70,80,90,100}};
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
			
		
	}

}
