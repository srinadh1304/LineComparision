package com.bridgelabz.linecomparision;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("****** Welcome to Line Comparision Program ******");
		int line1X1=0,line1Y1=0,line1X2=0,line1Y2=0;
		int line2X1=0,line2Y1=0,line2X2=0,line2Y2=0;
		Line line1 = new Line();
		Line line2 = new Line();
		line1X1=(int)Math.floor(Math.random()*10);
		line1Y1=(int)Math.floor(Math.random()*10);
		line1X2=(int)Math.floor(Math.random()*10);
		line1Y2=(int)Math.floor(Math.random()*10);

		line2X1=(int)Math.floor(Math.random()*10);
		line2Y1=(int)Math.floor(Math.random()*10);
		line2X2=(int)Math.floor(Math.random()*10);
		line2Y2=(int)Math.floor(Math.random()*10);
		
		line1.setStartCoordinates(line1X1, line1Y1);
		line1.setEndCoordinates(line1X2, line1Y2);
		line2.setStartCoordinates(line2X1, line2Y1);
		line2.setEndCoordinates(line2X2, line2Y2);
		LengthComparisionInterface lengthComparator = new LengthComparisionImplementation();
		System.out.println("***********Checking if the Lines are Equal using equals method:********");
		lengthComparator.equalsMethod(line1, line2);
		System.out.println("***********Comparing the two lines using compareTo method: **********");
		lengthComparator.compareToMethod(line1, line2);

	}
}
