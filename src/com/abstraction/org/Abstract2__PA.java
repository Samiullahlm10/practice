package com.abstraction.org;

public class Abstract2__PA extends Abstract1__PA{

	@Override
	void date() {
		
		System.out.print("28/");
		
	}

	@Override
	void month() {
		
		System.out.print("09/");
		
	}

	@Override
	void year() {
		
		System.out.print("2000");
	}
	
	public static void main(String[] args) {
		
		Abstract2__PA obj = new Abstract2__PA();
		obj.date();
		obj.month();
		obj.year();
	}

}
