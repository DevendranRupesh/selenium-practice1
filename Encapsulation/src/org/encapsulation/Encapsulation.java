package org.encapsulation;

public class Encapsulation {
	
	private String Name1= "Java Class";
	
	private String Name2="Python class";
	
	private String Name3= "Selenium class";

	public void setName1(String name1) {
		Name1 = name1;
	}

	public void setName2(String name2) {
		Name2 = name2;
	}

	public void setName3(String name3) {
		Name3 = name3;
	}

	public String getName1() {
		return Name1;
	}

	public String getName2() {
		return Name2;
	}

	public String getName3() {
		return Name3;
	}
	public static void main(String[] args) {
		
		Encapsulation e= new Encapsulation();
		
		e.setName1("Rupesh"); // if String Should be given in Double Quotes.
		e.setName2("rohit");  // if int then no quotes should be given.
		e.setName3("Ranjith");
		
		System.out.println(e.getName1());
		System.out.println(e.getName2());
		System.out.println(e.getName3());
		
		
	}
	
	
	
			

}
