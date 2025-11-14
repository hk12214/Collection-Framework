import java.util.*;

public class hashset {
    public static void main(String args[]) {
        //Creating HashSet and adding elements  
        HashSet<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
    }
}
           //check output
    /* Five One Four Two Three */

