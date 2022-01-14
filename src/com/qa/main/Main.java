package com.qa.main;

import com.qa.garage.Bicycle;
import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Motorbike;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car(true, "Hybrid", "Ford", "Fiesta ST");
		System.out.println(car1.getNumWheels());
		Motorbike mbike1 = new Motorbike(true, "Petrol", "Honda", "Wheelie");
		Bicycle bike1 = new Bicycle("Boardman", "8.6");

		Garage garage1 = new Garage();

		garage1.addVehicle(car1);
		System.out.println(garage1);
//		System.out.println(garage1.vehicleList.get(0).getNumWheels()); // add getNumWheels abstract method to Vehicle class and method to Car class
//		System.out.println(((Car) garage1.vehicleList.get(0)).numWheels); // option to cast to Car

//		Field xField = car1.getClass().getField("numWheels");
//		System.out.println(xField.get(car1));

		garage1.addVehicle(mbike1);
		System.out.println(garage1);

		garage1.addVehicle(bike1);
		System.out.println(garage1);

		System.out.println(garage1.calculateBill());

		garage1.removeVehicle(0);
		System.out.println(garage1);

		Car car2 = new Car(true, "Electric", "Fold", "Fiemba");
		Car car3 = new Car(true, "Old School", "Food", "Fielda");
		garage1.addVehicle(car2);
		garage1.addVehicle(car3);
		System.out.println(garage1);

		garage1.removeVehicleType(Car.class);
		System.out.println(garage1);

		garage1.emptyGarage();
		System.out.println(garage1);
	}

}

// When printing vehicleList, numWheels shows as 0 despite being car with default value numWheels = 4. Why?
// // accessing car1's attribute numWheels shows it has 4 wheels as specified in the Car class
// // however, accessing car1's numWheels via the object stored in vehicleList shows 0 wheels as specified in Vehicle class
// // https://www.javacodegeeks.com/2018/11/instance-variable-class-overridden-class.html
// What does super() do in constructor?
