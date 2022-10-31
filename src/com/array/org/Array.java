package com.array.org;

public class Array {
	
	public static void main(String[] args) {
		
		int[] a= {20,30,40,50,60};
		
		int[] i=new int[5];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		
//		System.out.println(i[3]);
		
		for (int j : i) {
			
			System.out.println(j);
			
		}
		
		System.out.println();
		
//		System.out.println(a[1]);
		
		for (int j : a) {
			
			System.out.println(j);
			
		}
		
	}
	
	

}
