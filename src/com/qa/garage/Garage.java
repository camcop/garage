package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public Garage(ArrayList<Vehicle> newVehicleList) {
		this.vehicleList = newVehicleList;
	}

	public Garage() {

	}

	public ArrayList<Integer> calculateBill() {
		ArrayList<Integer> bill = new ArrayList<Integer>();
		for (Vehicle vehicle : this.vehicleList) {
			System.out.println(vehicle);
			int vehicleBill = 0;
			if (vehicle.isHasEngine() == true) {
				vehicleBill += 50;
			}
			vehicleBill += (vehicle.getNumWheels() * 6);
			bill.add(vehicleBill);
		}
		return bill;
	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);

	}

	public void removeVehicle(int vehicleId) {
		this.vehicleList.remove(vehicleId);

	}

	public void removeVehicleType(Class<Car> type) {
		for (int i = (vehicleList.size() - 1); i >= 0; i--) {
			if (type.isInstance(vehicleList.get(i))) {
				this.vehicleList.remove(i);
			}
		}

	}

	public void emptyGarage() {
		this.vehicleList.clear();
	}

	@Override
	public String toString() {
		return "Garage [vehicleList=" + vehicleList + "]";
	}

}
