package com.keywords.org;

public class Static {

	static int i=10;
	int a=20;
	
	private void nonstatic() {

		System.out.println(i);
		System.out.println(a);
	}
	static {
		int d = 30;
		System.out.println(d);
		
	}
	
	private static void statickey() {

		System.out.println(i);
	//	System.out.println(a);
	}
	public static void main(String[] args) {
		
		statickey();
		
		Static obj = new Static();
		obj.nonstatic();
	}
}
