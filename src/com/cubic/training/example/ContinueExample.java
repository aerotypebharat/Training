package com.cubic.training.example;

public class ContinueExample {

public static void main(String[] args){
	
	
	    System.out.println("==================================");	
		System.out.println("printing even number from 1 to 20");
		System.out.println("===================================");
		
		for(int i = 1; i <= 20; i++){
			
			
			if(i%2!=0){   //if(i%2==1)  same thing 
				
				continue;
				
			}
			System.out.println("printing even number "  + i);
			
			
			
		}
		
		
		
}
	
	
	
}
