package Extra_Points_Homework;

import java.util.Scanner;

public class homePayment_main_class {

	public static void main(String[] args) {
		
		homeCalculatorFunctions homeBuyerCalculator= new homeCalculatorFunctions();
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Home Price: ");
		
		double home_base_Price = homeBuyerCalculator.getBasePrice(sc.nextDouble());
		
		
		
		System.out.print("Enter your creditscore:");
		double creditScore =  homeBuyerCalculator.getCreditScore2(sc.nextInt());
		System.out.println(creditScore);
		
	
		System.out.print("Enter loan Duration: ");
		int loan_duration = homeBuyerCalculator.getLoanTerm(sc.nextInt());
		
		
		System.out.print("Enter Down Payment: ");
		double downPayment = homeBuyerCalculator.getDown_payment(sc.nextDouble());
		
		System.out.print("Borrowed Loan Amount: ");
		double borrowedAmount = homeBuyerCalculator.getTotalBorrowed(home_base_Price, downPayment);
		System.out.println(borrowedAmount);
		
		
		System.out.print("Monthly Mortgate payment:");
		double monthly_payment = homeBuyerCalculator.getMonthlyPayment(borrowedAmount, loan_duration);
		System.out.println(monthly_payment);
		
				
		
	}

}
