
/********************************************************
* PadlockDriver.java
* Pranoj Thapa
*
* This program is a driver for the Padlock class.
*********************************************************/

package project1;

import java.util.Scanner;

public class PadlockDriver
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    int noOfWheels;     // number of thumbwheels in the padlock
    int noOfValues;     // numbers appear on each thumbwheel
    Padlock padlock;    // a padlock object
    
    System.out.println( 
      "This program generates all possible combinations" +
      " for a thumbwheel padlock. How exciting is that!");   
    System.out.print("\nHow many thumbwheels does your padlock have? ");
    noOfWheels = stdIn.nextInt();
    System.out.print("How many numbers appear on each thumbwheel? ");
    noOfValues = stdIn.nextInt();

    padlock = new Padlock(noOfWheels, noOfValues);
    padlock.displaySpecs();
    padlock.displayCombinations("", noOfWheels);
  } // end main
} // end class PadlockDriver
