package com.javaex.ex03;

public class Shape {
	
	//필드
	//자식 클래스가 사용할 수 있도록 접근제한자 변경
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	//기본 생성자가 있어야 super(); 의 오류가 안남
	public Shape() {
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
}

