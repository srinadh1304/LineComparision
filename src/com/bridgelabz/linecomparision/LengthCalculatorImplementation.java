package com.bridgelabz.linecomparision;

public class LengthCalculatorImplementation implements LengthCalculatorInterface{
	@Override
	public double calculateLength(Line line1) {
		int x1 = line1.getStartCoordinates().getxCoordinate();
		int y1 = line1.getStartCoordinates().getyCoordinate();
		int x2 = line1.getEndCoordinates().getxCoordinate();
		int y2 = line1.getEndCoordinates().getyCoordinate();
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
}
