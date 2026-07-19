package com.corejava;

public class MainConstr {
public static void main(String[] args) {
	ExpOnConstructor e=new ExpOnConstructor(25, 35);
	System.out.println(e.age);
	System.out.println(e.id);
	System.out.println(e.marks);
	System.out.println(e.perc);
	e.display();

}
}
