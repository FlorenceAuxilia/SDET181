package Day03;

import java.util.Scanner;

//Please write a java program to print the nth 
//fibonacci series number (example:9th fibonacci series is 34)

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0;
		int number2=1;
		Scanner myobj =new Scanner(System.in);
		System.out.println("Enter a number to find fibonacci series ");
		int n = myobj.nextInt();
		
		int sum =0;
		for (int i=1;i<n;i++)
		{
			sum =number1+number2;
			number1=number2;
			number2=sum;
			System.out.println(sum);
		}
		System.out.println(n +" number of fibonacci series is "+ sum);
		
	}

}
