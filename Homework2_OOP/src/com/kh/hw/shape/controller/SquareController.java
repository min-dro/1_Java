package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape(); 
	
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double r = (width*2) + (height*2);
		return r ;
	}
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double size = width * height; 
		return size;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		s.setType(4);
		return s.getType() + s.information();
	}
}
