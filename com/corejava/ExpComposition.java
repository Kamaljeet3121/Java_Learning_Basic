package com.corejava;

	class Engine{
		public void start() {
			System.out.println("Engine Started");
		}
	}

		class Car4{
			Engine e=new Engine();
			public void run() {
				e.start();
				System.out.println("Car is Running..");
			}
		}
public class ExpComposition {
	public static void main(String[] args) {
		Car4 c=new Car4();
		c.run();
	}
}
