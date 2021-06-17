package com.phoenix.designpatterns.singleton;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class President {
	private static President obj;
	private President()
	{
		
	}
	public static President getInstance()
	{
		if(obj==null)
			obj= new President();
		return obj;
	}
	public void representNation()
	{
		System.out.println("President represent nation");
	}

}
