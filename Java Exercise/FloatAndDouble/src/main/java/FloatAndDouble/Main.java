/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloatAndDouble;

/**
 *
 * @author angkokleong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	float myMinFloatValue = Float.MIN_VALUE;
    	float myMaxFloatValue = Float.MAX_VALUE;
    	
    	System.out.println("Float minimum value = " + myMinFloatValue);
    	System.out.println("Float maximum value = " + myMaxFloatValue);
    	
    	double myMinDoubleValue = Double.MIN_VALUE;
    	double myMaxDoubleValue = Double.MAX_VALUE;
    	
    	System.out.println("Double minimum value = " + myMinDoubleValue);
    	System.out.println("Double maximum value = " + myMaxDoubleValue);
    	
    	int myIntValue = 5 / 3;
    	float myFloatValue = (float) 5.25;
    	float myFloatValue2 =  5f / 3f;
    	double myDoubleValue = 5.00 / 3.00;
    	
    	System.out.println("MyIntValue= " + myIntValue);
    	System.out.println("MyFloatValue = " + myFloatValue2);
    	System.out.println("Mydoublevalue = " + myDoubleValue);
    	
    	
    	double pounds = 200d;
    	double kg = 0.45359237d;
    	
    	System.out.println("The result for " + pounds + " pounds is " + (pounds * kg));
    	
    	
    	
    }
    
}
