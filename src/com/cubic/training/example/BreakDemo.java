package com.cubic.training.example;

public class BreakDemo {

	public static void main(String[] args){
		
		
	    System.out.println("==================================");	
		System.out.println("printing number from 1 to 10");
		System.out.println("===================================");
	
	for(int i = 1;;++i ){  //no ceiling for i here   
		
		if(i==11)break;// use break instead of continue
		
		//if(i<11)continue;// use continue instead of break   here "for(int i = 1;;++i )"
		
		
		
		System.out.println(i);  //---------------------------------------------^^  there is no celing to stop here so 
		                           // ---------------------------------it will continue .........
	
		
		
		
		
		
	}
	
	System.out.println("===================================");
	}
	
}
