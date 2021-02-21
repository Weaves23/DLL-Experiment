package A3DLL;
// Program:A3DLL
// Written by:Ben Weaver
// Program Description: uses implemented classes to create a double linked list of items passed by the client file
// File name: DLL.java
// File description: implements provided dll components to generate the list
// Other files in this project:DLLADT, DLLNode, DLLTesterInteger
// Challenges:figuring out the order to link objects, implementing the interface, adding content to nodes
// Time Spent: 8 hours
// Specified Output:                      <-- the output specified by the assignment (if submitting multiple files, fill this in in only one)
// --------------------         
/*
DLLTesterInteger Output:

 
Inserted Last: 11.  
Inserted Last: 33.  
Inserted Last: 55.  
There are  3 items in the list. First:    11. Last:    55. 
Removed First: 11.  
Removed Last: 55.  
There are  1 items in the list. 
Is the list empty?  false
Inserted First: 22.  
Inserted Last: 44.  
Inserted First: 66.  
There are  4 items in the list. First:    66. Last:    44. 

Removed First Item: 66.  
Removed Last Item: 44.  
There are  2 items in the list. 
Removed First Item: 22.  
Removed Last Item: 33.  
Is the list empty?  true
BUILD SUCCESSFUL (total time: 0 seconds)

*/
// Actual Output:                      <-- copy & paste the actual output of your program  (if submitting multiple files, fill this in in only one) 
// --------------------  
//
/*
DLLTesterInteger Output:

 
Inserted Last: 11.  
Inserted Last: 33.  
Inserted Last: 55.  
There are  3 items in the list. First:    11. Last:    55. 
Removed First: 11.  
Removed Last: 55.  
There are  1 items in the list. 
Is the list empty?  false
Inserted First: 22.  
Inserted Last: 44.  
Inserted First: 66.  
There are  4 items in the list. First:    66. Last:    44. 

Removed First Item: 66.  
Removed Last Item: 44.  
There are  2 items in the list. 
Removed First Item: 22.  
Removed Last Item: 33.  
Is the list empty?  true
BUILD SUCCESSFUL (total time: 0 seconds)

*/
////                   Revision History

// Date:                   By:                  Action:
// ---------------------------------------------------
/*
3/12/17      bw    overwite methods in interface, created nodes, would not print items, returned null
3/13/17      bw    rewrote order nodes are relinked in remove methods, handles first three items, returns null after
3/14/17      bw    rewrote order, all nodes print, all methods work, added assert statements
*/



import java.util.NoSuchElementException;
public class DLL<I extends Integer> implements DLLADT<I>{
    
   private I i;
   private DLLNode<I> node;
   private DLLNode<I> head = new DLLNode();
   private DLLNode<I> tail = new DLLNode();
   private DLLNode<I> seeker = new DLLNode();
   private int NodeNum = 0;
   
   
   //used to determine the size of the DLL
  //preconditions NodeNum must not be less than zero
  //postconditions none
  public int size() {
  assert(NodeNum > -1):"List contents cannot be  less than zero";
  return NodeNum;
  }
  
  //determines whether or not the list has nodes between the head and tail
   //preconditions none
  //postconditions none
  public boolean isEmpty(){
        if(head.getNextNode() != tail)
            return false;
        else
            return true;
  }
  
  //gets the item of the first node
 //preconditions head.getnextnode is not tail
  //postconditions none
  public I getFirstItem() throws NoSuchElementException{
     assert(head.getNextNode() != tail):"next item is tail which is null";
     return head.getNextNode().getElement();
  }
  
  //gets the element of the last node
   //preconditions tail.getprevnode is not head
  //postconditions none
  public I getLastItem() throws NoSuchElementException{
      assert(tail.getPrevNode() != head):"previous node equals is head which is null";
       return tail.getPrevNode().getElement();
  }
  
  //removes the first item of the list and connects the next node with the head
 //preconditions heads next node cannot be tail
  //postconditions none
  public I removeFirstItem () throws NoSuchElementException{
        assert(head.getNextNode() != tail):"tail cannot be removed, also tail is null";
        
        i = head.getNextNode().getElement();
        
        head.setNextNode(head.getNextNode().getNextNode());
         
        head.getNextNode().setPrevNode(head);
        
        NodeNum--;
        
        return i;
  
  }
  
  //removes the last item of the list a reconnects the previous node with the tail
   //preconditions tails prev node is not null
  //postconditions none
  public I removeLastItem() throws NoSuchElementException{
         assert(tail.getPrevNode() != head):"head cannot be removed, also head is null";
         
         i = tail.getPrevNode().getElement();
        
         tail.setPrevNode(tail.getPrevNode().getPrevNode());
         
         tail.getPrevNode().setNextNode(tail);
        
         NodeNum--;
        
        return i;
  }
  
  public I getList()throws NoSuchElementException{
      
      //assert(seeker.getNextNode() != tail);
      
      I fullList = null;
      int count = 0;
      i=head.getNextNode().getElement();
      
      /*while(count <= index){
          count++;
          seeker = seeker.getNextNode();
      }
      i = seeker.getElement();*/
      fullList = i;
      return fullList;
  }
  
  //overwritten toString found in class DLLADT
   //preconditions none
  //postconditions none
  public String toString(){
      
      return " ";
      
}
  
  //creates a new node and places it at the front of the list
 //preconditions none
 //postconditions none
    @Override
    public void insertFirstItem(I n) {
        
       node = new DLLNode();
       node.setElement(n);
       
       if(head.getNextNode() == null){
       head.setNextNode(tail);
       }
       
       head.getNextNode().setPrevNode(node);
       node.setNextNode(head.getNextNode());
       head.setNextNode(node);
       node.setPrevNode(tail);
        
        
       
       
        NodeNum++;
        
    }
    
    //creates a new node and places it at the end of the list
 //preconditions  none
  //postconditions none
    @Override
    public void insertLastItem(I n) {
        
       node = new DLLNode();
       node.setElement(n);
       if(tail.getPrevNode() == null){
       tail.setPrevNode(head);
       }
       tail.getPrevNode().setNextNode(node);
       node.setPrevNode(tail.getPrevNode());
       tail.setPrevNode(node);
       node.setNextNode(tail);
      
       NodeNum++;
      
    }
}