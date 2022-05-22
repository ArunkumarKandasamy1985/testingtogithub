package com.arun.git.demo.test;

public class Test {

	public static void display() {
		String a = "String";
		String b = "String";
		if(a.equals(b)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		
		if(a==b) {
			System.out.println("equals n");
		} else {
			System.out.println("not equals n");
		}
	}
	public static void main(String[] args) {

		Test.display();
	}

}
