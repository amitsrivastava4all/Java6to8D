package com.apps;

//class ValidationUtility
public interface ValidationUtility
{
	/*private ValidationUtility(){
		
	}*/
	public static boolean isBlank(String value){
		if(value==null){
			return true;
		}
		if(value.length()==0){
			return true;
		}
		return false;
	}
}
