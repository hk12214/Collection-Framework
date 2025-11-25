import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, Double> m1 = new HashMap<>();
        m1.put("Alice", 5000.0);
        m1.put("Bob", 600.0);
        System.out.println(m1);
        List<Map.Entry<String, Double>> entri = new ArrayList<>(m1.entrySet());
        entri.sort(Map.Entry.comparingByValue());
        System.out.println("sorted by value:");
        for (Map.Entry<String, Double> ent_v : entri) {
            System.out.println(ent_v.getKey() + ": " +
                    ent_v.getValue());

        }
         System.out.println("sorted by key:");
            entri.sort(Map.Entry.comparingByKey());
            for (Map.Entry<String, Double> ent_k : entri) {
                System.out.println(ent_k.getKey() + ": " +
                        ent_k.getValue());

            }
    }
}
