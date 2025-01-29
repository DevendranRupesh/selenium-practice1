package org.interfaceproject;

public  class Interclass implements Interfacepp1 ,Interfacepp2 {
	
	public void bagtype() {
		
		System.out.println("Shoulderbag");
		
	}
	
	public void Shoetype() {
		System.out.println("leathershoe");
	}

	
	public void uniformsize() {
		System.out.println("56");
	}
	
	public void nameofperson() {
		System.out.println("shanmugan");
	}
	
	public static void main(String[] args) {
		Interclass obj= new Interclass ();
		
		obj.bagtype();
		obj.Shoetype();
		obj.uniformsize();
		obj.nameofperson();
	}
}
