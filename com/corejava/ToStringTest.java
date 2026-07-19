package com.corejava;

public class ToStringTest {
	int a;
	String name;
	int age;
	@Override
	public String toString() {
		return "This Object Contains ("+ a + " " + name + " " + age + ")";
	}
	public ToStringTest(int a, String name, int age) {
		super();
		this.a =a;
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		ToStringTest b=new ToStringTest(15,"Kamal",84052);
		System.out.println(b);
		ToStringTest v=new ToStringTest(35,"Gopu",6458);
		System.out.println(v);
	}
}
