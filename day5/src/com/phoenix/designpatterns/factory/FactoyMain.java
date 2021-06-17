package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;

/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class FactoyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car m= new Car();
		CarFactory.newCar("Couple");
		CarFactory.newCar("Sedan");
		CarFactory.newCar("Luxury");
		CarFactory.newCar("Sport");
		m.start();
		m.run();
		m.stop();

	}

}
