package Homework_2;

public class mainRun {

	public static void main(String[] args)
	{
		nonRunnableFunctions nonRunFunction = new nonRunnableFunctions();
		
		int addThreeNumber =	nonRunFunction.add3Numbers(2, 3, 5);
		
		System.out.println("This is the total of three intergers:"+addThreeNumber);
		System.out.println();
		
		
		nonRunFunction.printData("Agile 1 Tech");
		System.out.println();
		
		
		
		boolean checkEquality12= nonRunFunction.checkEquality(23, 23);
		
		System.out.println("If the Input numbers are the same, the result will be True and vice versa: "+checkEquality12);
		System.out.println();
		
		
		nonRunFunction.printName();
		System.out.println();
		
		
		nonRunFunction.printBoolean(true, false);
		
		
		
	}

	
	
	
	
	
	
	
}
