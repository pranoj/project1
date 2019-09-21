/********************************************************
* Padlock.java
* Pranoj Thapa
*
* This program displays all the possible combinations 
* for a thumb wheel padlock.
*********************************************************/

package project1;

public class Padlock
{
  private int noOfwheels;  // number of thumbwheels
  private int noOfValues;  // numbers appearing on each thumbwheel
  
  //****************************************************************
  
  // This is a constructor which stores passed-in values from main
  
  public Padlock(int noOfWheels, int noOfValues)
  {
    this.noOfwheels = noOfWheels;
    this.noOfValues = noOfValues;
  } // end constructor

  //****************************************************************
  
  // this method prints no. of thumbwheels and no. of values on each wheel
  
  public void displaySpecs()
  { 
    System.out.println("\nYour padlock has " + this.noOfwheels + 
      " thumbwheels with " + this.noOfValues + " digits on each wheel.\n");
  } // end displaySpecs
 
  //****************************************************************
  
  // this recursive method prints the padlock’s possible combinations
  
  public void displayCombinations(String pattern, int wheels)
  {
    if (wheels == 0)
    {
      System.out.print(pattern + " ");
    } // end if
    else
    {  
       for (int i=1; i<=this.noOfValues; i++)
       {
         displayCombinations(pattern + i, wheels - 1);
       } // end for
       if (wheels == 1)
       {
         System.out.println();
       } // end if
    } // end else  
  } // end displayCombination
} // end class Padlock
