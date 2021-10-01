package Extra_Points_Homework;

import java.util.Scanner;

public class homeCalculatorFunctions 
{
	



	int loanTerm = 30;
	double monthlyPayment = 0;
	double totalBorrowed =0;
	double downPayment = 0;
	double monthlyApr = 0;
	double basePrice = 0;
	
	
	
	
	public double getMonthlyPayment(double totalBorrowed,double numberofPeriods)
	{
		double  monthlyPaymnt = totalBorrowed/numberofPeriods;
		
		return monthlyPaymnt;
	}
	
	
	public double getTotalBorrowed(double basePrice, double downPayment)
	{
		double borroedAmount = basePrice -downPayment;
		
		return borroedAmount;
	}
	 
	
	
	public double getDown_payment(double downPaymentNumber)
	{
	return downPaymentNumber;
	}
	
	
	public int getLoanTerm (int loanDuration) 
	
	{
		return loanDuration;
	}
	
	public double getBasePrice(double number1)
	{
		return number1;
	}
		
	
	public double  getCreditScore2(int enterCreditScore1)
	
	{
		
		double apr =0;
		
		
		if (enterCreditScore1 >=760 )
		{
			apr=1.5;
		}
		
		else if (enterCreditScore1 < 760 && enterCreditScore1 >= 700) 
		{
			
			apr=3;
		}
		else if (enterCreditScore1 < 700 && enterCreditScore1 >= 650) 
		{
			
			apr = 4;
		}
		
		else if (enterCreditScore1 < 650 && enterCreditScore1 >= 600) 
		{
			
			apr = 5;
		}
		
		else 
		{
			System.out.println("Your Application has been declined because of low credit score.");
		}
		
		System.out.print("This is your APR Rate: ");
		return apr;
	}
	
	
	
	
	
	}

