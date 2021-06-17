package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class CarFactory {
	public static Car newCar(String carType)
	{
		Car nc=null;
		if(carType=="Sedan")
			return new SedanCar();
		else if(carType=="Couple")
			return new CoupleCar();
		else if(carType=="Sport")
			return new SportCar();
		else if(carType=="Luxury")
			return new LuxuryCar();
		else
			return nc;
		
		
	}

}
