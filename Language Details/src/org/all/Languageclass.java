package org.all;

public class Languageclass extends Telugu{// child class mulitilevel inheritance
	
	void languageclass() {
		
		System.out.println("Languageclass");
	}
	
	public static void main(String[] args) {
		
		Languageclass ln= new Languageclass();
		
		ln.languageclass();
		ln.Telugu1();
		ln.Tamil1();
		ln.English1();
	}

}
