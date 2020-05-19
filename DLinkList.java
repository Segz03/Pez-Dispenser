
package randomnumpezdispenser;

import java.util.Random;

/**
 * @author Francisco J Segarra Jr
 */

public class DLinkList 
{
   private Node head;
   private Node tail;
   private int size = 0;
   
   // constructor that creates an empty linked list
   public DLinkList()
    {
        head = null;
        tail = null;
        size = 0;
    }
   
    // constructor that initializes the DLL to a Node
    public DLinkList(Node n)
    {
        head = n;
    }
   
    // method to test if list is Empty
    public boolean isEmpty()
    {
        if (head == null) 
            return true;
       
        else
            return false;
    }
   
    // method for the size of the DLL
    public int size()
    {
        return size;
    }
    
    // method for inserting node in the front of list
    public void insertFront(int data)
    {
        Node temp = new Node(data);
        
        if (isEmpty())
        {
            tail = temp;
        }
        
        else
        {
            head.pre = temp;
        }
        
        temp.next = head;
        head = temp;
        
        size++;
    
    } // end method
    
    // method for inserting node at the end of list
    public void insertEnd(int data)
    {
        Node temp = new Node(data);
        
        if (isEmpty())
        {
            head = temp;
        }
        else
        {
            tail.next = temp;
            temp.pre = tail;
        }    
        
        tail = temp;
        
        size++;
    } // end  method        
    
    // method for printing list in order
    public void print()
    {
        if (head == null)
        {
            return;
        }
        
        Node temp = head;
        
        while(temp != null)
        {
            System.out.print(temp.getData() + ", ");
            temp = temp.next;
        }    
        
        System.out.print("null");
    } // end method
    
    // method for printing list in reverse order
    public void printReverse()
    {
        if (tail == null)
        {
            return;
        }
        
        Node temp = tail;
        
        while(temp != null)
        {
            System.out.print(temp.getData() + ", ");
            temp = temp.pre;
        }    
        
        System.out.print("null"); 
    } // end method
    
        public int recSum(Node head) 
        {
            Node temp = head;

            if (temp == null) 
            {
                return 0;
            } 
            else 
            {
                return temp.getData() + recSum(head.next);
            }
        }
} // end class
