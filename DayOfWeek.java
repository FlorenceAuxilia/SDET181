package Day03;

import java.util.Scanner;

//Please write a java program to print the day of 
//the week when number is given (example: 1 means Sunday should be printed)

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj =new Scanner(System.in);
		System.out.println("Enter a number of the day 1-7");
		int num =myobj.nextInt();
		
		switch (num) {
		case 1:
			System.out.println(" It is Sunday");
			break;	
		case 2:
			System.out.println(" It is Monday");
			break;
		case 3:	
			System.out.println(" It is Tuesday");
			break;
		case 4:
			System.out.println(" It is Wednesday");
		case 5:
			System.out.println(" It is Thursday");
			break;
		case 6:
			System.out.println(" It is Friday");
			break;
		case 7:
			System.out.println(" It is Saturday");
			break;

		default:
			System.out.println(" Wrong input enter number between 1-7");
			break;
		}

		myobj.close();
	}

}
