package com.corejava;

public class College {
String collegeName;
String collegeCode;
String address;
College(String collegeName,String collegeCode,String address){
	this.collegeName=collegeName;
	this.collegeCode=collegeCode;
	this.address=address;
}
College(College other){
	this.collegeName=other.collegeName;
	this.collegeCode=other.collegeCode;
	this.address=other.address;
}
public String toString() {
	return "Values are->"+collegeName+" "+collegeCode+" "+address;
}
}
