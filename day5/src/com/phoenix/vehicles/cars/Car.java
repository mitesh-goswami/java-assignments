package com.phoenix.vehicles.cars;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Car");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move Car");

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Start Car");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("Stop Car");
	}
	
	

}
