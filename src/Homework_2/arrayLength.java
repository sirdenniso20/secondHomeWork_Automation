package Homework_2;

public class arrayLength {

	public static void main(String[] args) 
	{
		int intArray[] = new int[5];
		
		intArray [0]=100;
		intArray [1]=200;
		intArray [2]=300;
		intArray [3]=400;
		intArray [4]=500;
		
		String strArray []= new String[5];
		strArray [0]="Orange";
		strArray [1]="Apple";
		strArray [2]="Pomagranate";
		strArray [3]="Pineapple";
		strArray [4]="Kiwi";
		
		

		
		System.out.println("List of Integers : "+intArray[0]+","+intArray[1]+","+intArray[2]+","+intArray[3]+","+intArray[4]);
		System.out.println("List of Strings : "+strArray[0]+", "+strArray[1]+", "+strArray[2]+", "+strArray[3]+", "+strArray[4]);
	}

}
