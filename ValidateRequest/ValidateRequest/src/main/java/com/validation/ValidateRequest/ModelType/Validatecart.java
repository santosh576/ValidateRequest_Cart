package com.validation.ValidateRequest.ModelType;

import java.util.ArrayList;

public class Validatecart {
	
	ArrayList<String> catalogueList=new ArrayList<String>();
	public Validatecart()
	{
		catalogueList.add("Shirt");
		catalogueList.add("Shoe");
		catalogueList.add("Trousers");
		catalogueList.add("Slippers");
	}
	
	public boolean validatecartrequest(String CatalougeName)
	{
	if((catalogueList.contains(CatalougeName)))
	{
		return true;
	}
	else
	{
		return false;
	}
		
	}

}
