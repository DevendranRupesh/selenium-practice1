package Inheritancepractice;

public class Childproperty extends parentproperty {
	
	void childproperty() {
		
		System.out.println("Child property in chennai");
	}

	public static void main(String[] args) { // main method
		
		
		Childproperty ch= new Childproperty();
		ch.childproperty();
		ch.parentproperty1();
		
		

	}

}
