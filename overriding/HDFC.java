package com.tnsif.daytwo.overriding;

public class HDFC extends SBI {

	public float getRateOfInterest()
	{   
		return 7.0f;
	}
	
	public HDFC getObject()
	{
		return this;
	}

}
