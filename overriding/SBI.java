package com.tnsif.daytwo.overriding;
//subclass
public class SBI  extends RBI {
	 @Override
	 public float getRateOfInterest()
	 {
		 return 7.5f;
	 }
	 
	 public SBI getObject()
	 {
		 return this;
	 }
}
