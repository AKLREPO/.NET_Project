import java.util.*;
import java.lang.*;
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String myString = "This is a string";
		
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";

		System.out.println("myString is equal to " + myString);
		java.lang.String numberString = "250.55";
		
		numberString = numberString + "49.95";
		
		System.out.println(numberString);
		
		java.lang.String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		
		System.out.println("LastString is equal to " + lastString);
		
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		
		System.out.println(lastString);
		
	}

}
