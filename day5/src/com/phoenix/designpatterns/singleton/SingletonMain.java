package com.phoenix.designpatterns.singleton;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class SingletonMain {
	public static void main(String [] args)
	{
		Earth h=Earth.getInstance();
	
		President p=President.getInstance();
		PrimeMinister pm=PrimeMinister.getInstance();
		Sun s=Sun.getInstance();
		h.createLife();
		p.representNation();
		pm.serveNation();
		s.giveLight();
	
	}

}
