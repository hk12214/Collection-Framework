 import java.util.*;  
public class linkedlist{  
 public static void main(String args[]){  
  LinkedList<String> pl=new LinkedList<String>();  
  pl.add("Java");  
  pl.add("Python");  
  pl.add("C++");  
  pl.add("C#");  
   Iterator<String> itr=pl.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }   }  } 