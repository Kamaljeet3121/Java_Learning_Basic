package com.corejava;
import java.util.Scanner;

class Car{
	int x;
	public void run() {
		System.out.println("Car Runs");
	}
}
class Mini extends Car{
	int w;
	public void mini() {
		System.out.println("Mini Car hold 3 persons.");
	}
}
class Sedan extends Car{
	int v;
	public void sedan() {
		System.out.println("Sedan Car hold 4 persons.");
	}
}
class Suv extends Car{
	int u;
	public void suv() {
		System.out.println("Mini Car hold 5 persons.");
	}
}
class Luxury extends Car{
	int t;
	public void lux() {
		System.out.println("Lux Car hold 4 P.persons.");
	}
}

public class Uber {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("--Enter 1 for MINI--");
	System.out.println("--Enter 2 for SEDAN--");
	System.out.println("--Enter 3 for SUV--");
	System.out.println("--Enter 4 for LUXURY--");
	int input=in.nextInt();
	switch(input) {
		case 1-> {System.out.println("--MINI Booked--");
				Car c1=new Mini();
				c1.run();
			}
		case 2->{System.out.println("--SEDAN Booked--");
				Car c1=new Sedan();
				c1.run();
			}
		case 3->{System.out.println("--SUV Booked--");
				Car c1=new Suv();
				c1.run();
			}
		case 4->{System.out.println("--Luxury Booked--");
				Car c1=new Luxury();
				c1.run();
			}
		}
//	Mini c2=(Mini)new Car();
//	c2.mini();
	in.close();
	}
}
