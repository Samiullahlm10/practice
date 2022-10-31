package com.cons.org;

public class Constructor {
	
	int a ;
	String b;
	
	public Constructor() {

		a=10;
		b="sam";
	
	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
