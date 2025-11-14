import java.util.*;

public class vectorleg {  
public static void main(String  ar[]) 
{ Vector<String> vec= new Vector<String>(); 
vec.addElement("B"); vec.addElement("A"); 
vec.addElement("T"); vec.addElement("M"); 
vec.addElement("A"); vec.addElement("N"); 
System.out.println("Vector = "+vec); 
System.out.println("Size of Vector = " + vec.size());
System.out.println("First element in Vector = "+vec.firstElement());
 System.out.println("Last element in Vector ="+vec.lastElement()); 
 System.out.println("Element at 2nd index = " + vec.elementAt(2));
vec.removeElementAt(2);
 System.out.println("After removing element at 2nd index, Vector = "+ vec); } }


