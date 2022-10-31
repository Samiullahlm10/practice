package com.abstraction.org;

public class Interface2__FA implements Interface1__FA{

	@Override
	public void laptop() {

		System.out.println("HP");
	}

	@Override
	public void mobile() {

		System.out.println("Apple");
	}

	@Override
	public void watch() {

		System.out.println("Titan");
	}
	public static void main(String[] args) {
	
		Interface2__FA obj = new Interface2__FA();
		obj.laptop();
		obj.mobile();
		obj.watch();
	}

}
