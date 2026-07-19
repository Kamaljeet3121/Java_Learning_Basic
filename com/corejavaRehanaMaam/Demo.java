package com.corejavaRehanaMaam;

public interface Demo {
	public static final int a=10;
	
	public abstract void Student();
	
	public static void main(String[] args) {
		System.out.println("Hiii");
	}
	
	default void test() {
		System.out.println("test method");
	}
}
