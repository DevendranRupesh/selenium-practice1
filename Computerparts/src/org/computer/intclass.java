package org.computer;

public  class intclass implements ComputerSoftware, ComputeHardware {
	
	public void Desktopmodel() {
		
		System.out.println("Model no is IS 751245");
		
		
	}
	public void Softwareresources() {
		
		System.out.println("resources in Software");
		
	}
	
	 public void hardwareResources() {
		System.out.println("resources in hardware");
		
	}
	
	public static void main(String[] args) {
		 
		intclass rm= new  intclass();
	
		
		rm.Desktopmodel();
		
		rm.hardwareResources();
		rm.Softwareresources();
		
	}
	
}
	
		
	

	


