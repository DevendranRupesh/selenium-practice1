package org.Day1;

public class Objectandclass {// using multiple class in single package.
	
	void method1 () {
		
		System.out.println("morning breakfast"); // class {
		
		                                                    
                 }
	void method2 () {
		System.out.println("Afternoon lunch");
		
		}
	}
class Objectandclass1  {
			
	void method3 () {
				
		System.out.println("Night dinner");
			
			}
			
	void method4() {
				
		System.out.println("Eat more fruits");
			}
			
	public static void main(String[] args) {
		
	
		
        //classname refname= new classname();
			
			Objectandclass1 obj= new Objectandclass1 ();
			Objectandclass obj1=new Objectandclass();
			obj1.method1();
			obj1.method2();
			obj.method3();
			obj.method4();
			
			}

         }




