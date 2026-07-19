package com.corejava;

	class AirConditioner{
		String brand;
		public AirConditioner(String brand) {
			this.brand=brand;
		}
	}
	class Car2{
		AirConditioner a;
		Car2(AirConditioner a){
			this.a=a;
		}
		public void display() {
			System.out.println(a.brand);
		}
	}
public class ExpAggregation {
	public static void main(String[] args) {
		AirConditioner a= new AirConditioner("LG");
		Car2 c=new Car2(a);
		c.display();
	}
}