package com.corejava;
abstract class Laptop{
	abstract void price();
}
class Hp extends Laptop{
//	static int kam=265;
	void price() {
		System.out.println("Price is 45000");
	}
}
class Lenovo extends Laptop{
	void price() {
			
		System.out.println("Price is 34000");
	}
}
public class AbstractEx3 {
	public static void main(String[] args) {	
	Hp h1=new Hp();
//	System.out.println(h1.kam);
	Lenovo l1=new Lenovo();
//	System.out.println(l1.kam);
	h1.price();
	l1.price();
}
	}


