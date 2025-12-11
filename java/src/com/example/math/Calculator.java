package com.example.math;

public class Calculator {
	protected int a;
	protected int b;
	
	public Calculator(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void add() {
		System.out.println("the addition is :"+(a+b));
	}
	public void sub() {
		System.out.println("the subtraction is :"+(a - b));
	}
}
