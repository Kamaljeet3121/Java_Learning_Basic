package com.corejava;


interface Bank {
	public abstract void rateOfInterest();
}

class Axis implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("9%");
		
	}
}
class KotakMahindraBank implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("8.90%");
	}
	
}
	

public class ExpOnInterface {
public static void main(String[] args) {
	Axis a=new Axis();
	a.rateOfInterest();
	KotakMahindraBank k = new KotakMahindraBank();
	k.rateOfInterest();
}

}
