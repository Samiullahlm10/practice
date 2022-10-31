package com.polymorphism.org;

public class Method_Overloading {

	public void mobile() {

		System.out.println("Readme");
	}
	public void mobile(int a) {

		System.out.println("Apple");
	}
	public void mobile(char b) {

		System.out.println("Realme");
	}
	public void mobile(float c,String s) {
		
		System.out.println("Oppo");

	}
	public static void main(String[] args) {
		
		Method_Overloading obj = new Method_Overloading();
		obj.mobile();
		obj.mobile(1);
		obj.mobile(1.1f,"sam");
		obj.mobile('a');
	}
}
