package com.example.shapes;

import com.example.utils.MathUtils;

public class Circle {
	protected double radius;
	protected double area;
	MathUtils mt = new MathUtils();
	
	protected double var = mt.pi();
	
	public Circle(double radius) {
		this.radius= radius;
	}
	public double getarea() {
		area = radius * radius * var;
		return area;
	}
}
