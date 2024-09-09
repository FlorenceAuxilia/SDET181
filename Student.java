package Day01;

import java.util.Scanner;


//import java.util.Scanner;

public class Student {
	
	
	static int math;
	static int lang;
	static int science;
	static int history;
	int total;
	int avg;
	
	
	void total(int s1,int s2,int s3,int s4)
	{	
		total=s1+s2+s3+s4;
		System.out.println("Total is "+ total);
	}
	
	void average()
	{
		avg =total/4;
		System.out.println("Average is "+ avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		    		    
		   // Enter username and press Enter
		    System.out.println("Enter Name "); 
		    String userName = myObj.nextLine();   
		    System.out.println("Enter math mark");
		    math=myObj.nextInt();
		    System.out.println("Enter lang mark");
		    lang=myObj.nextInt();
		    System.out.println("Enter science marks");
		    science=myObj.nextInt();
		    System.out.println("Enter history mark");
		    history=myObj.nextInt();
		    
		    //System.out.println("Username is: " + userName); 
		
		
		
		Student s= new Student();
			s.total(math,lang,science,history);
			s.average();
				
	}

	

	

}
