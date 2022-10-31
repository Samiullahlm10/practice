package com.cons.org;

public class Constructor2 {
	
      int age;
	 String name;

	public Constructor2(int a,String b) {

    	  age = a;
          name = b;
     }

     public static void main(String[] args) {
		Constructor2 obj = new Constructor2(20, "Sami");
		System.out.println(obj.age);
		System.out.println(obj.name);
	}
  
}
