package com.polymorphism.org;

public class Method_Overriding extends Method_Overloading{
	

	@Override
	public void mobile() {
		super.mobile();
	}
	@Override
	public void mobile(char b) {
		super.mobile(b);
	}
	@Override
	public void mobile(int a) {
		super.mobile(a);
	}
	
	public void mobile(String s) {
		System.out.println("Vivo");
	}
	@Override
	public void mobile(float c, String s) {
		this.mobile(s);
		super.mobile(c, s);
	}
	
	public static void main(String[] args) {
		Method_Overriding obj = new Method_Overriding();
		obj.mobile();
		obj.mobile(1.1f, "sam");
		obj.mobile(0);
		obj.mobile('c');
		
	}
}
	

