package com.phoenix.machines;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
import com.phoenix.interfaces.Movable;

public class Robot implements Movable {
	public void processData()
	{
		System.out.println("robot processdata");
	}
	public void senseInfo()
	{
		System.out.println("robot senseInfo");
	}
	public void useArtificialIntelligence()
	{
		System.out.println("robot Artificial intelligence");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
