package Day01;

import java.util.Scanner;

/* create a java program to calculate 
 * the monthly gross salary of an employee*/

public class MonthlyTakehomeSalary {

	public static int bPay;
	public static int level;
	public int boa;
	public int bonus;
	public double gross;
	public double ygross;
	public double pf;
	public double yearlyTax;

	//pf = 12 % of basic basic*0.12
	void pf(int b) {
		pf = b * 0.12;
		// return pf;
		System.out.println("Pf ammount is " + pf);

	}

	//this method calculates the basket of allowance and bonus bases on employee level
	void basketOfAllowance(int a) {

		if (a == 1) {
			boa = 5000;
			bonus = 2000;
			System.out.println("Basket of Allowance is " + boa);
			System.out.println("Bonus is " + bonus);
		} else if (a == 2) {
			boa = 7000;
			bonus = 2500;
			System.out.println("Basket of Allowance is " + boa);
			System.out.println("Bonus is " + bonus);
		} else if (a == 3) {
			boa = 9000;
			bonus = 3000;
			System.out.println("Basket of Allowance is " + boa);
			System.out.println("Bonus is " + bonus);
		} else if (a == 4) {
			boa = 10000;
			bonus = 3500;
			System.out.println("Basket of Allowance is " + boa);
			System.out.println("Bonus is " + bonus);
		} else {
			System.out.println("Enter correct employee level 1-4");
			
		}
	}

	//monthly gross salary
	double monthlyGross() {
		gross = (bPay + boa + bonus) - pf;
		return gross;
	}
//yearly gross salary
	double yearlyGross() {
		ygross = gross * 12;
		return ygross;
	}

//Tax calculation as per gov norms
	double yearlyTax() {
		double monthlytax;

		if (ygross < 250000) {
			System.out.println("tax Nill");
		} else if ((ygross > 250000) && (ygross < 500000)) {
			yearlyTax = ygross * 0.5;
		} else if ((ygross > 500000) && (ygross < 750000)) {
			yearlyTax = ygross * 0.10;
		} else if ((ygross > 750000) && (ygross < 1000000)) {
			yearlyTax = ygross * 0.15;
		} else if ((ygross > 1000000) && (ygross < 1250000)) {
			yearlyTax = ygross * 0.20;
		} else if ((ygross > 1250000) && (ygross < 1500000)) {
			yearlyTax = ygross * 0.25;
		} else if ((ygross > 1500000)) {
			yearlyTax = ygross * 0.30;
		}

		System.out.println("Yearly Tax " + yearlyTax);
		monthlytax = yearlyTax / 12;
		System.out.println("Monthly Tax " + monthlytax);

		return monthlytax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Basic pay ");
		bPay = myObj.nextInt();
		System.out.println("Enter Employee level ");
		level = myObj.nextInt();

		MonthlyTakehomeSalary mth = new MonthlyTakehomeSalary();
		mth.pf(bPay);
		if (level >=1 && level <=4) {
		mth.basketOfAllowance(level);
		}else
		{System.out.println("Enter correct employee level 1-4");
		level = myObj.nextInt();
		mth.basketOfAllowance(level);
		}
		
		double gro;
		gro = mth.monthlyGross();
		System.out.println("Mothly gross salary " + gro);
		double ygro;
		ygro = mth.yearlyGross();
		System.out.println("Yearly gross salary " + ygro);
		double mtax;
		mtax = mth.yearlyTax();
		System.out.println("Mothly Net salary after tax  " + (gro - mtax));
	}

}
