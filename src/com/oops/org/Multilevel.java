package com.oops.org;

public class Multilevel extends Single2{
	
	@Override
	public void bottle() {
		super.bottle();
	}
	@Override
	public void laptop() {
		super.laptop();
	}

	@Override
	public void mobile() {
		super.mobile();
	}

	@Override
	public void watches() {
		super.watches();
	}
	@Override
	public void watch() {
		super.watch();
	}
	
	public static void main(String[] args) {
		Multilevel obj = new Multilevel();
		obj.bottle();
		obj.laptop();
		obj.mobile();
		obj.watch();
		obj.watches();
				
		
		
	}
}
