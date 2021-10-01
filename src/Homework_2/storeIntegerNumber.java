package Homework_2;

import java.util.Scanner;

public class storeIntegerNumber {

	public static void main(String[] args) {
	
		int num1;
		int num2;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a number: ");
		num1 = sc.nextInt();		
		
		
		if (num1 > 0)
		{
			num2 = num1;
			
			System.out.println("You have entered a Positive Number: "+num2);
		}
		
		else if (num1 < 0)
		{
			num2=num1;
			
			System.out.println("You have entered a Negative Number: "+ num2);
		}
		
		else
		{
			System.out.println("This number is zero and its neither positive nor negative");
		}
		sc.close();
	}

}
