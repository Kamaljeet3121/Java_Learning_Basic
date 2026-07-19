package com.corejava;

interface Walking{
	public void walk() ;
	public void swim();
}
interface swimming{
	public void swim();
}
class Duck implements Walking,swimming{

	public void walk() {
		System.out.println("walking....");
		
	}
	public void swim() {
		System.out.println("Swimming...");
	}
}

public class Frong {
public static void main(String[] args) {
	Duck d1=new Duck();
	d1.swim();
	d1.walk();
}
}
