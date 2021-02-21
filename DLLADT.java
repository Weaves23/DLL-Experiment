package A3DLL;
// Program:  A3DLL 
// Written by: Margie Bleichman
// Program Description:  The program will implement a structure like Java's ArrayList,  
//     using a Node based Doubly Linked List using Sentinels.
// File name: DLLADT.java (Doubly Linked List Abstract Data Type)
// File description: This is a Java Interface that provides the ADT to be used to implement the DLL class.
//      This interface uses generics.  
//      DLL.java should implement this interface, using generics as well.
// Files in this program:  
//      To be written by student: DLL.java
//      Provided by professor:    DLLADT.java, DLLNode.java, DLLTesterInteger
//      Note: DO NOT MODIFY the provided files 
// Revision History:
// Date:      By:             Action:
// ---------------------------------------------------
// 3/1/17     mb              created 

import java.util.NoSuchElementException;
public interface  DLLADT <E> {
 
  // provide the number of items in the list
  public int size() ;

  // is the list empty?
  public boolean isEmpty() ;

  // return the first item without removing it 
  public E getFirstItem() throws NoSuchElementException ;
  
  // return the last item without removing it 
  public E getLastItem() throws NoSuchElementException ;
  
  // Add an item to the front of the list
  public  void  insertFirstItem(E element) ;
  
  // Add an item to the end of the list
  public  void  insertLastItem(E element) ;

  // Remove an item from the front of the list
  // Throws: NoSuchElementException - if this list is empty ;
  public E removeFirstItem () throws NoSuchElementException ;
  
  // Remove an item from the end of the list  
  // Throws: NoSuchElementException - if this list is empty ;
  public E removeLastItem() throws NoSuchElementException;
  
  // a method that can be used to get a string representing the whole list
  public String toString() ;

}