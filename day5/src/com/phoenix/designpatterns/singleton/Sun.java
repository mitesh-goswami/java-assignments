package com.phoenix.designpatterns.singleton;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class Sun {
	private static Sun obj;
	private Sun()
	{
		
	}
	public static Sun getInstance()
	{
		if(obj==null)
			obj= new Sun();
		return obj;
	}
	public void giveLight()
	{
		System.out.println("sun gives light");
	}

}
