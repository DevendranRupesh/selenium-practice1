package org.interfaceproject;

public class Intclass implements Interfaceproject,Interfaceproject1 { // main class where we implement both interface class.
	 
	
	
	public void colour() {// implements
		
		System.out.println("blue....");
	}
	
	public void shape() {
		System.out.println("Rectangle...");
	}
	
	public void cartype() {
		System.out.println("Volvo");
	}
	
	public void biketype() {
		
		System.out.println("Pulsar");
	}
	
	public static void main(String[] args) {
		
		Intclass Ic= new Intclass();
		
		Ic.colour();
		Ic.shape();
		Ic.cartype();
		Ic.biketype();
		
		
		
		
	}
	

}
