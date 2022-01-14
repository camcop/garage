package com.qa.garage;

public abstract class Vehicle {

	public static void travelForwards() {
		System.out.println("Carry passengers forwards");
	}

	public abstract String getModeOfTransport();

	public abstract int getNumWheels();

	public abstract boolean isHasEngine();

}
