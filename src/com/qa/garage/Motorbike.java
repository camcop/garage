package com.qa.garage;

public class Motorbike extends Vehicle {

	private String modeOfTransport = "wheels";
	private int numWheels = 2;
	private boolean hasEngine = true;
	private String powertrainType;
	private String make;
	private String model;

	public Motorbike(boolean hasEngine, String powertrainType, String make, String model) {
		this.hasEngine = hasEngine;
		this.powertrainType = powertrainType;
		this.make = make;
		this.model = model;
	}

	public Motorbike() {
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

	public String getPowertrainType() {
		return powertrainType;
	}

	public void setPowertrainType(String powertrainType) {
		this.powertrainType = powertrainType;
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
		return "Motorbike [hasEngine=" + hasEngine + ", powertrainType=" + powertrainType + ", make=" + make
				+ ", model=" + model + "]";
	}

}
