package com.phoenix.planets;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class Earth extends Planet{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Revolve Earth");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		super.rotate();
		System.out.println("Rotate Earth");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("Move Earth");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
