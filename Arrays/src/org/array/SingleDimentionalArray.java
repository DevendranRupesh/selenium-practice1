package org.array;

public class SingleDimentionalArray {
	
	//Single dimensional Array -index based from 0 to value
	//Approach -1
	// int a[]= new int [5];
	
	public static void main(String[] args) {
		
		int a[]= new int[6];             //Approach-1
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		System.out.println(a.length);
		System.out.println(a[5]);
		
		
		int b[]= {10,20,30,40,50};      // aproach-2
		
		System.out.println(b.length);
		System.out.println(b[3]);
		
		
		for(int i=0;i<a.length;i++) {  // for loop example for(initialization;condition;incremental){
			                                       //statement
			
			System.out.println(a[i]);
			
		for(int x:a) {                // for each loop example for(initialization condition:value)
				
				System.out.println(x);   //statement
			}
			
			
		}
		
			

}
}
