
package randomnumpezdispenser;

/**
 * @author Francisco J Segarra Jr
 */

public class Node 
{
    //pointers to the next node in a linked list
    Node next;
    Node pre;
    private int data;
    
    // Constructor of the node with data in it
    public Node(int d)
    {
	this.data = d;
	next = null;
        pre = null;
    }
        
    // setters
    public void setData(int d)
    {
        data = d;
    }        
    
    public void setNext(Node n)
    {
        next = n;
    }
    
    public void setPre(Node n)
    {
        pre = n;
    }        
    
    
    
    // getters
    public int getData()
    {
        return data;
    }
    
    public Node getNext()
    {
	return next;
    }
    
    public Node getPre()
    {
        return pre;
    }        
        
} // end class
