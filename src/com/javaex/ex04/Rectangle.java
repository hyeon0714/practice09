package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;
    
    public Rectangle() {
    }
    
    public Rectangle(double width, double height) {
    	this.height=height;
    	this.width=width;
    }

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
    
    public double getArea() {
    	return width*height;
    }
    
    public double getPerimeter() {
    	return (width+height)*2;
    }
    
    public void resize(double s) {
    	this.width=width*s;
    	this.height=height*s;
    }
    
}