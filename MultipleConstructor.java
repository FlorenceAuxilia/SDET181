package Day03;

import Day01.Student;

public class MultipleConstructor {

	
	int total;
	int avg;
	MultipleConstructor(int s1,int s2,int s3,int s4)
	{	
		total=s1+s2+s3+s4;
		System.out.println("Total is "+ total);
		avg =total/4;
		System.out.println("Average is "+ avg);
	}
	
	MultipleConstructor(int s1,int s2,int s3)
	{	
		total=s1+s2+s3+35;
		System.out.println("Total is "+ total);
		avg =total/4;
		System.out.println("Average is "+ avg);
	}
	MultipleConstructor(int s1,int s2)
	{	
		total=s1+s2+35+35;
		System.out.println("Total is "+ total);
		avg =total/4;
		System.out.println("Average is "+ avg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleConstructor s= new MultipleConstructor(90,85,45,70);
		
		
		MultipleConstructor s1= new MultipleConstructor(92,72,70);
		MultipleConstructor s2= new MultipleConstructor(72,70);
		
		
		
	}

}
