package com.bridgelabz.linecomparision;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("****** Welcome to Line Comparision Program ******");
		int point1X1=0,point1Y1=0,point2X2=0,point2Y2=0;
		point1X1=(int)Math.floor(Math.random()*10);
		point1Y1=(int)Math.floor(Math.random()*10);
		point2X2=(int)Math.floor(Math.random()*10);
		point2Y2=(int)Math.floor(Math.random()*10);
		double lengthOfLine=Math.sqrt(((point2X2-point1X1)*(point2X2-point1X1))+((point2Y2-point1Y1)*(point2Y2-point1Y1)));
		System.out.println("Length of line: "+lengthOfLine);
	}
}
