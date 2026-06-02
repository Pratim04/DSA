
import java.util.*;

public class HashMAP {
    
    public static void main(String[] args) {
        
        Map<String, Integer> students = new HashMap<>();
        
        students.put("Navin",56);
        students.put("Harsh",16);
        students.put("Pratim",18);
        students.put("Krittika",71);
        
        students.put("Pratim", 69);

        // System.out.println(students);

        // System.out.println(students.get("Pratim"));
        
        System.out.println(students.keySet());

        for(String n : students.keySet()) {
            System.out.println(n + " : " + students.get(n));
        }
    }
    
}
