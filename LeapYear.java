package Day03;


//Please write a java program to print the leap years between 2000 and 2100
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =2000;i<2100;i++)
		{
			if (i % 4 ==0)
			{
				System.out.println(i +"is a leap year");
			}
		}

	}

}
