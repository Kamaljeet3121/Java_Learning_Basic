package com.corejava;

public class ExpOnConstructor {
int id,kam,sm;
int age;
int marks;
double perc;
String name;

public ExpOnConstructor(int id, int age, int marks, double perc, String name) {
	this(id,age);
	this.marks = marks;
	this.perc = perc;
	this.name = name;
}

public ExpOnConstructor(int id, int age) {
	this.id = id;
	this.age = age;
}

public void display() {
	System.out.println(id);
}

}
