import java.util.*;

public class arraylist {
  public static void main(String args[])
  { ArrayList <String> al = new ArrayList<String>();
    al.add ("Sheger"); al.add ("Adama");
    al.add ("Hawassa"); al.add ("BahirDar");
    al.add ("Mekele"); 
    al.add (1,"DireDawa");
    al.add (2,"Asosa");
    System.out.println("Size of the Array List is: " + al.size ());
    System.out.print("\nRetrieving elements in ArrayList using Iterator:");
   Iterator it = al.iterator ();
   while (it.hasNext () )
     System.out.print (it.next () + "\t");
    
  }
}
