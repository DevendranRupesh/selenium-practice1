package Multilevelinheritance;

public class Childproperty extends Parentproperty {
	
	void childproperty() {
		
		System.out.println("Child brought london and America property");
	}

	
	public static void main(String[] args) {
		
		Childproperty che= new Childproperty();
		che.childproperty();
		che.parentproperty();
		che.Grandparentproperty1();
         }
	}
	

