package com.oops.org;

public class Single2 extends Single{

	@Override
	public void laptop() {
		super.laptop();
	}
	@Override
	public void mobile() {
		super.mobile();
		
	}
	public void watch() {

	}
	
	@Override
	public void watches() {
		this.watch();
		System.out.println("sonata");
	}
	public void bottle() {

		System.out.println("Tupperware");
	}
	
	public static void main(String[] args) {
	Single2 obj = new Single2();
	obj.laptop();
	obj.mobile();
	obj.bottle();
	obj.watches();
	
	}
}
