//***DIRECTIONS*** in order for you to choose the size of the list 
//go to line 18 and change the chosenSize variable.

package randomnumpezdispenser;

/**
 * @author Francisco J Segarra Jr.
 */
    
import java.util.*;

public class RandomNumPezDispenser 
{
    public static void main(String[] args) 
    {
        
    // choose the size you want the list to be
    Random value2 = new Random();
    int chosenSize = value2.nextInt(100);
    
    // creating the Double Linked List
    DLinkList dll = new DLinkList();
   
    // loop for putting random numbers in DLL
    for (int i = 0; i < chosenSize ; i++)
    {
        // random number maker
        Random value = new Random();
        int number = value.nextInt();
        
        // inserting the nodes to the end of list
        dll.insertEnd(number);
    } // end for loop
    
    dll.print();
    
    System.out.println();
    
    dll.printReverse();
    
    System.out.println("\nthe size of the list is " + dll.size());
    
    int sum = recSum(dll.getHead);
    
      // creating the stack
    Stack <Node> stack = new Stack <Node>();
    
    } // end Main
    
} // end class
