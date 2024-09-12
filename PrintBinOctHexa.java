package Day03;

import java.util.Scanner;

public class PrintBinOctHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner myobj =new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = myobj.nextInt();
		
		System .out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toHexString(n));
	}

}
