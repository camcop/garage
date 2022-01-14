package com.qa.garage;

public class Bicycle extends Vehicle {

	private String modeOfTransport = "wheels";
	private int numWheels = 2;
	private boolean hasEngine = false;
	private String make;
	private String model;

	public Bicycle(String modeOfTransport, boolean hasEngine, String make, String model) {
		this.modeOfTransport = modeOfTransport;
		this.hasEngine = hasEngine;
		this.make = make;
		this.model = model;
	}

	public Bicycle() {
	}

	public Bicycle(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bicycle [make=" + make + ", model=" + model + "]";
	}

}
