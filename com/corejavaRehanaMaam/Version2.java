package com.corejavaRehanaMaam;

public class Version2 extends AbstractCalciVer2{
	@Override
	int add(int a,int b) {
		return a+b;
	}
	@Override
	int sub(int a,int b) {
		return a-b;
	}
	int factorial(int a) {
		int prod=1;
		for(int i=1;i<=a;i++) {
			prod*=i;
		}
		return prod;
	}
	int square(int a) {
		return a*a;
	}
}
