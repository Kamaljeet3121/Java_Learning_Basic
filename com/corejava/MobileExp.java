package com.corejava;

public class MobileExp {
	String brand;
	int price,ram,rom;
	public String toString() {
		return "Brand is: "+brand+",Price is: "+price+",Ram is: "+ram+",Rom is: "+rom;
	}
	public int hashCode() {
		return price;
	}
	public boolean equals(Object other) {
		MobileExp m0=(MobileExp) other;
		return this.price==m0.price && this.brand==m0.brand
				&&this.ram==m0.ram&&this.rom==m0.rom;
	}
	public MobileExp(String brand, int price,int ram,int rom) {
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
	}
	public static void main(String[] args) {
		MobileExp m1=new MobileExp("Samsung", 38000, 8, 256);
		MobileExp m2=new MobileExp("Motorola", 24000, 6, 128);
		MobileExp m3=new MobileExp("MI", 19999, 8, 128);
		
		System.out.println(m1);
		System.out.println("Price is: "+m1.hashCode());
		System.out.println("Equal Method returns: "+m1.equals(m2));
		
		System.out.println(m2);
		System.out.println("Price is: "+m2.hashCode());
		System.out.println("Equal Method returns: "+m2.equals(m3));
		
		System.out.println(m3);
		System.out.println("Price is: "+m3.hashCode());
		System.out.println("Equal Method returns: "+m3.equals(m1));
	}
}
