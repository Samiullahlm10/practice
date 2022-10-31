package com.keywords.org;

public class Final {
	
	final int a = 10;
	
	public final void mobile() {

		System.out.println(a);
	//	a=20;
	}
	public void tv() {

		System.out.println("20");
	}
	
	public static void main(String[] args) {
		
		Final obj= new Final();
		obj.mobile();
		obj.tv();
	}

}
