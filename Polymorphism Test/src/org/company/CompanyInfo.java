package org.company;

public class CompanyInfo {
	
	void CompanyName1(String a) {
		System.out.println("Company Name:"+a);
	}
	void CompanyName2(String b) {
		System.out.println("Company Name:"+b);
	}
	void CompanyName3(String c) {
		System.out.println("Company Name:"+c);
	}
	void CompanyName4(String d) {
		System.out.println("Company Name:"+d);
	}
	
	public static void main(String[] args) {
		
		CompanyInfo obj= new CompanyInfo();
		obj.CompanyName1("Hcl");
		obj.CompanyName2("cognizant");
		obj.CompanyName3("TCS");
		obj.CompanyName4("Hexaware");
	}
	

}
