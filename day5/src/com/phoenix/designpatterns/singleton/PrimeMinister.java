package com.phoenix.designpatterns.singleton;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class PrimeMinister {
	private static PrimeMinister obj;
	private PrimeMinister()
	{
		
	}
	public static PrimeMinister getInstance()
	{
		if(obj==null)
			obj= new PrimeMinister();
		return obj;
	}
	public void serveNation()
	{
		System.out.println("Prime Minister serve nation");
	}

}
