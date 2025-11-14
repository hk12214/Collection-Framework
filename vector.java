import java.util.*;

public class vector {

    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("SoEEC");
        v.add("SoMMCE");
        v.add("SoCEA");
        v.add("SoANC");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}