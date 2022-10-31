package com.abstraction.org;

public class Interface3__MI implements Interface1__FA,Interface0{

	@Override
	public void car() {
		
		System.out.println("BMW");
	}

	@Override
	public void bike() {
		
		System.out.println("KTM");
	}

	@Override
	public void cycle() {
		
		System.out.println("Hercules");
	}

	@Override
	public void laptop() {
		
		System.out.println("Hp");
	}

	@Override
	public void mobile() {
		
		System.out.println("Samsung");
	}

	@Override
	public void watch() {
		
		System.out.println("Titan");
	}
	
	public static void main(String[] args) {
		
		Interface3__MI obj = new Interface3__MI();
		obj.bike();
		obj.car();
		obj.cycle();
		obj.laptop();
		obj.mobile();
		obj.watch();
		
	}

}
