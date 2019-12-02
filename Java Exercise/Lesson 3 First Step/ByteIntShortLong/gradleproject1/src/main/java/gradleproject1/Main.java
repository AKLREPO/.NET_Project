/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

/**
 *
 * @author angkokleong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        
        System.out.println("Busted Min Value = " + (myMinIntValue - 10));
        System.out.println("Busted Max value = " + (myMaxIntValue + 10));
        
        //int myMaxIntTest = 2147483648;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);    
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);    
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);   
        
        long testLong = 2_233_233_233L;
        
        byte myNewByteValue = (byte) (myMinIntValue / 2);
        
        System.out.println(myNewByteValue);
        
        byte newByteValue = 64;
        short newShortValue = 32000;
        int newIntValue = 54000;
        long newLongValue = (50000 + 10 * (newByteValue + newShortValue + newIntValue));
        
        short shortTotal = (short) (1000 + 10 * (newByteValue + newShortValue + newIntValue));
        
        
    }
    
}
