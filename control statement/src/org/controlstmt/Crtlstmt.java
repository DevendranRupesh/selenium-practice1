package org.controlstmt;

public class Crtlstmt {
	
	public static void main(String[] args) {// if(condition )
		
		
	    int i=10;
		
		if(i>=18) { // condition True
			
			System.out.println("Eligible For vote");
			
		}
		
		else {
			
			System.out.println("not eligible for vote");
		}
		
		
		
		
		String s="ramesh";
		
		if(s== "ramu") {
			
			System.out.println("ramesh");
		}
		else {
			System.out.println("ramu");
		}
		
		int number=-5;
		
		if(number>0) {
			
			System.out.println("Number is Positive");
		}
		
		else {
			System.out.println("Number is Negative");
		}
		
		
		int Week=6;
		
		if(Week==1) {
			System.out.println("Sunday");      // condition using If and If else Nested loop
			}
		else if (Week==2){
			System.out.println("Monday");
		}
		else if (Week==3){
			System.out.println("Tuesday");
			
			}
		else if (Week==4) {
			System.out.println("Wednesday");
		}
		else if(Week==5) {
			System.out.println("Thursday");
		}
		
		else if (Week==6) {
			System.out.println("Friday");
		}
		else if(Week==7) {
			System.out.println("Saturday");
		}
		else {
			
			System.out.println("week not matching");
		}
		
	 int weekno = 6;
	
	switch(weekno)
	
	{
	case 1: System.out.println("Monday");break;
	case 2: System.out.println("Tuesday");break;
	case 3: System.out.println("Wednesday");break;
	case 4: System.out.println("Thursday");break;
	case 5: System.out.println("Friday");break;
	case 6: System.out.println("Saturday");break;
	
	default : System.out.println("not matching");
	}
	
	
	
	
	
	 String weekname = "Monday";
	
	switch(weekname)
	
	{
	case "Monday": System.out.println("Firstday");break;
	case "Tuesday": System.out.println("Secondday");break;
	case "Wednesday": System.out.println("Thirdday");break;
	case "Thursday": System.out.println("fourthday");break;
	case "Friday": System.out.println("Fifthday");break;
	case "Saturday": System.out.println("Sixthday");break;
	
	default : System.out.println("not matching");
	}
	
	}
	
	
}
	

	
	
	

	

