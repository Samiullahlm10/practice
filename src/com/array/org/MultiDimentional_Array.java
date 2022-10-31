package com.array.org;

public class MultiDimentional_Array {
	
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4,5,6},{11,22,33,44,55,66},{111,222,333,444,555,666},{1111,2222,3333,4444,5555,6666},{0,0,0,0,0,0}};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				
				System.out.print(a[i][j]+",");
				
				
			}
			System.out.println();
			
		}
	}

}
