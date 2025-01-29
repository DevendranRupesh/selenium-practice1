package org.encapsulation;

public class Encapsulation2 {
	
	private String Name= "rajesh";
	
	private int age = 45;
	
	
	public void setName(String name) {
		Name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		Encapsulation2 obj = new Encapsulation2();
		
		obj.setName("Ramesh");
		obj.setAge(40);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
		
	}

}
