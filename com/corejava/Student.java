package com.corejava;

public class Student extends College {
	String name;
	int age;
	int id;
	Student(String collegeName,String collegeCode,String address,String name,int id, int age){
		super(collegeName,collegeCode,address);
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public String toString() {
		return "Values are->"+collegeName+" "+collegeCode+" "+address+"\n"+"values of Student"+name+" "+id+" "+age;
	}
 public void display() {
		System.out.println("-------Details------");
		System.out.println(this);
//		System.out.println(collegeName);
//		System.out.println(collegeCode);
//		System.out.println(address);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(id);
		System.out.println("---End-Of-Program---");
 }
}
