package com.corejava;

public class HashCodeTest {
	String name ;
	int id,age;
	public HashCodeTest(String string, int id, int age) {
		super();
		name = string;
		this.id = id;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return id;
	}
	public static void main(String[] args) {
		HashCodeTest h1 = new HashCodeTest("Srikant", 124, 5640);
		HashCodeTest h2 = new HashCodeTest("Maaz.", 357, 15640);	
		System.out.println(h1.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());


	}
}
