
package A3DLL;
// Program:  A3DLL 
// Written by: Margie Bleichman
// Program Description:  The program will implement a Node based Doubly Linked List using Sentinels and Generics.
// File name: DLLTesterInteger.java 
// File description: This is a tester for a Node based Doubly Linked List using Sentinels and Generics.
// Files in this program:  
//      To be written by student: DLL.java
//      Provided by professor:    DLLADT.java, DLLNode.java, DLLTesterInteger
//      Note: DO NOT MODIFY the provided files 
// Revision History:
// Date:      By:             Action:
// ---------------------------------------------------
// 3/1/17     mb              created 

public class DLLTesterInteger
{
    public static void main (String[] args){
    Integer i;
    DLL<Integer> L = new DLL<>();
    Integer n;
    System.out.println ("DLLTesterInteger Output:\n");
    try {
        System.out.println (L); // this one is EMPTY
        n = 11; L.insertLastItem(n); 
        System.out.print("Inserted Last: " + n + ". "); System.out.println (L);
        n = 33; L.insertLastItem(n);
        System.out.print("Inserted Last: " + n + ". "); System.out.println (L);
        n = 55;  L.insertLastItem( n);
        System.out.print("Inserted Last: " + n + ". ");  System.out.println (L);

        System.out.print("There are  " + L.size() + " items in the list. ");	
        System.out.print("First:    " + L.getFirstItem() + ". ");	
        System.out.println("Last:    " + L.getLastItem() + ". ");	

        System.out.print("Removed First: " + L.removeFirstItem() +". ");System.out.println (L);
        System.out.print("Removed Last: " + L.removeLastItem() +". "); System.out.println (L);
        System.out.println("There are  " + L.size() + " items in the list. ");
        System.out.println("Is the list empty?  "+L.isEmpty());	

        n = 22;  L.insertFirstItem( n);
        System.out.print("Inserted First: " + n + ". "); 	System.out.println (L);
        n = 44;  L.insertLastItem( n);
        System.out.print("Inserted Last: " + n + ". "); 	System.out.println (L);
        n = 66;  L.insertFirstItem( n);                        
        System.out.print("Inserted First: " + n + ". ");   System.out.println (L);

        System.out.print("There are  " + L.size() + " items in the list. ");
        System.out.print("First:    " + L.getFirstItem() + ". ");	
        System.out.println("Last:    " + L.getLastItem() + ". ");	
        System.out.println();

        System.out.print("Removed First Item: " + L.removeFirstItem() +". ");System.out.println (L);
        System.out.print("Removed Last Item: " + L.removeLastItem() +". ");System.out.println (L);
        System.out.println("There are  " + L.size() + " items in the list. ");	

        System.out.print("Removed First Item: " + L.removeFirstItem() + ". ");System.out.println (L);
        System.out.print("Removed Last Item: " + L.removeLastItem() + ". ");System.out.println (L);
        System.out.println("Is the list empty?  " + L.isEmpty());	
// The following should force an exception if we uncomment it:
//        System.out.println("The next removeFirst() should force an exception: ");
//        System.out.print("Removed First: " + L.removeFirstItem() + ". ");System.out.println (L);
    }
    catch (Exception e)
       {System.out.println ("Error: "+ e.getMessage());}
   }
}