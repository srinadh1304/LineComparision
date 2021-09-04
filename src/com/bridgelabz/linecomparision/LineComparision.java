package com.bridgelabz.linecomparision;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("****** Welcome to Line Comparision Program ******");
		int line1X1=0,line1Y1=0,line1X2=0,line1Y2=0;
		int line2X1=0,line2Y1=0,line2X2=0,line2Y2=0;
		line1X1=(int)Math.floor(Math.random()*10);
		line1Y1=(int)Math.floor(Math.random()*10);
		line1X2=(int)Math.floor(Math.random()*10);
		line1Y2=(int)Math.floor(Math.random()*10);

		line2X1=(int)Math.floor(Math.random()*10);
		line2Y1=(int)Math.floor(Math.random()*10);
		line2X2=(int)Math.floor(Math.random()*10);
		line2Y2=(int)Math.floor(Math.random()*10);
		Double lengthOfLine1=Math.sqrt(((line1X2-line1X1)*(line1X2-line1X1))+((line1Y2-line1Y1)*(line1Y2-line1Y1)));
		Double lengthOfLine2=Math.sqrt(((line2X2-line2X1)*(line2X2-line2X1))+((line2Y2-line2Y1)*(line2Y2-line2Y1)));
		if(lengthOfLine1.compareTo(lengthOfLine2)==0)
		{
			System.out.println("Length of Line 1 is equal to Length of Line 2");
		}
		else if(lengthOfLine1.compareTo(lengthOfLine2)<0)
		{
			System.out.println("Length of Line 1 is less than  Length of Line 2");
		}
		else 
		{
			System.out.println("Length of Line 1 is greater than  Length of Line 2");
		}
	}
}
