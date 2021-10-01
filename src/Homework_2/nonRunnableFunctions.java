package Homework_2;

public class nonRunnableFunctions 
{
	public int add3Numbers(int num1, int num2, int num3)
	{
		int num4 = num1+num2+num3;
		
		return num4;
	}
	
	public void  printData(String strData)
	
	{
		String data1 = strData;
		
		System.out.println("Data you have entered is: "+data1);
	}
	
	
	
	public boolean checkEquality(double firstNum, double secondNum)
	{
		double equalityNum1 = firstNum;
		double equalityNum2 = secondNum;
		
		if (equalityNum1 == equalityNum2)
		{
			return true;
		}
		
		else
		{
		return false;
		}
	}
		
	public void printName() 
	{
		
		System.out.println("Dennis Osei-Wusu");
	}
		
	
	
	public void printBoolean(boolean x, boolean y)
	{
		boolean booleanNum1 = x;
		boolean booleanNum2 = y;
		
		System.out.println("Enter First Boolean Value: "+booleanNum1);
		System.out.println("Enter Second Boolean Value: "+booleanNum2);
	}
	
	
	
}

