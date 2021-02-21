package A3DLL;

// Program Description:  The program will implement a structure like Java's ArrayList,  using a Node based Doubly Linked List.
// File name: DLLNode.java
// File description: This is the DLLNode class.
//      DLL.java should use this DLLNode.
// Files in this program:  
//      To be written by student: DLL.java
//      Provided by professor:    DLLADT.java, DLLNode.java, DLLTesterInteger
//      Note: DO NOT MODIFY the provided files 
// Revision History:
// Date:      By:             Action:
// ---------------------------------------------------
// 3/1/17     mb              created 

public class DLLNode <E> {
	private E element;
        private DLLNode <E>  prev;
	private DLLNode <E>  next;
        
        // empty constructor, creates DLLNode with everything set to null
        // pre-conditions: none
        // post-conditions: returns a reference to a new instance of a DLLNode element
        public DLLNode(){}  

	// constructor:  takes element, previous node, next node
        // pre-conditions: none
        // post-conditions: returns a reference to a new instance of a DLLNode element
        //                  prev, next are set to parameter values
	public  DLLNode(E e, DLLNode <E>  p, DLLNode <E>  n){
		element = e;
                prev = p;
		next = n;
	}

	// get the element
        // pre-conditions: none
        // post-conditions: element is returned
	public E getElement(){return element;}

	// get previous node
        // pre-conditions: none
        // post-conditions: previous node reference is returned
	public DLLNode <E>  getPrevNode(){return prev;}
        
        // get next node
        // pre-conditions: none
        // post-conditions: next node reference is returned
	public DLLNode <E>  getNextNode(){return next;}

	// set element
        // pre-conditions: none
        // post-conditions: element is replaced with parameter
	public void setElement(E e){element = e;}

	// set previous node
        // pre-conditions: none
        // post-conditions: previous is replaced with parameter
	public void setPrevNode(DLLNode <E>  p){prev = p;}
        

	// set next node
        // pre-conditions: none
        // post-conditions: next is replaced with parameter
	public void setNextNode(DLLNode <E>  n){next = n;}
        
        // set all references in node to null  
        // (used to prepare for garbage collection)
        // pre-conditions: none
        // post-conditions: element, next, prev are all set to null
        public void nullify (){ element = null; next = prev = null;}
      
        // return a string representation of the node
        // pre-conditions: none
        // post-conditions: returns toString of the element
        public String toString () {return ""+element;}
}
