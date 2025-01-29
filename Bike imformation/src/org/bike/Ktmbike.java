package org.bike;

public class Ktmbike implements bike{
	
	private static final String S = null;


	public void Cost() {
		System.out.println("Cost of Bike is rs 200000");
	}
	public void Speed() {
		System.out.println("Speed of the Bike 300 rpm");
	}
	@Override
	public void cost1() {
		
		System.out.println("Cost rs100000");
	}
	@Override
	public void Speed1() {
		
		System.out.println("rpm-200");
		
	}
       static  int a=20;
	   static int s=30;
	  
	  
	public static void main(String[] args) {
		
		Ktmbike bm= new Ktmbike();
		
		bm.a=567;
		bm.s=40;
		
		System.out.println("a:"+a);
		System.out.println("s:"+s);
		
		bm.Cost();
		bm.Speed();
		bm.cost1();
		bm.Speed1();
		
	}
}	
		
		
		
		
	

