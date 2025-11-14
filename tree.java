import java.util.*;  
 public class tree {
    public static void main(String args[]){  
//Creating and adding elements  
TreeSet<Integer> set=new TreeSet<Integer>();  
set.add(5);  
set.add(2);  
set.add(1);  
set.add(3);
set.add(4); 
//traversing elements  
Iterator<Integer> itr=set.iterator();  
while(itr.hasNext()){  
    System.out.println(itr.next());
 
}}}
/*output
1
2
3
4
5
 */
