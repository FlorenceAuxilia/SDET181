package Day03;

import java.util.Scanner;

public class PrimeNumber {
	
 //	Please write a java program to find the
//	first 30 prime numbers. Hint : for loop and multiple if-else 
	
	static boolean isPrime(int n){
		
		if (n==1||n==0)
			return false;
		
		for (int i = 2; i < n; i++) {
			
			if(n % i== 0) {
				return false;
				
			}
		}
			
			return true;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	    
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a number");
		int N= obj.nextInt();
		for(int i=0;i<=N;i++)
		{
			if (isPrime( i))
			{
				System.out.println(i +"");
			}
		}
		
	            }
	   }
