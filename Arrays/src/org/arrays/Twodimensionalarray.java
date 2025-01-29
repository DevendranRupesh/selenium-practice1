package org.arrays;

public class Twodimensionalarray {
	
	
	public static void main(String[] args) {
		
		
		int a [][]= new int [3][3];// Two dimensional Array
		
		//inserting values in array // 1st Approach
		
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
		a[2][0]=700;
		a[2][1]=800;
		a[2][2]=900;
		
		
		//Aproach2
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
		int c[][] = {{100,200,300},
				    {500,600,700},
				    {800,900,400}
		
		};
		System.out.println("number of rows :"+a.length);
		System.out.println("number of coloums in 0th index:"+a[0].length);
		System.out.println("number of coloums in First row:"+a[1].length);
		System.out.println("number of coloums in 2nd row:"+a[2].length);
		System.out.println(a[1][0]);
		
		System.out.println("number of rows :"+b.length);
		System.out.println("number of coloums in 0th index:"+b[0].length);
		System.out.println("number of coloums in First row:"+b[1].length);
		System.out.println("number of coloums in 2nd row:"+b[2].length);
		System.out.println(b[1][0]);
		
		
		System.out.println("number of rows :"+c.length);
		System.out.println("number of coloums in 0th index:"+c[0].length);
		System.out.println("number of coloums in First row:"+c[1].length);
		System.out.println("number of coloums in 2nd row:"+c[2].length);
		System.out.println(c[1][0]);
		
	    //Nested  Forloop
		
		
		int a1[][] = {{101,201,301},
			          {501,601,701},
			          {801,901,401}
			         
		               };
	
		
		for(int i=0;i<a1.length;i++) {//outerloop
		for(int j=0;j<a1.length;j++) {//inner loop
			
			
			
			System.out.println(a1[i][j]+"");
		}
			System.out.println();
			
		}
		
		
	}
	
}
		
	
	




