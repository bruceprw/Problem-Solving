import java.util.Map;
import java.util.HashMap;
public class Anogram {
    public static String input1 = "bustnail";
    public static String input2 = "istanbul";
    public static Map<Character,Integer> m1 = new HashMap<>();
    public static Map<Character,Integer> m2 = new HashMap<>();
    
    public static void main(String args[]) {
        
        for (int i=0;i<input1.length();i++)
        {
            int oldVal=0;
            char key = input1.charAt(i);
            if (!m1.containsKey(key)) {
                m1.put(key,1);
            }
            else {
                oldVal=m1.get(key);
                m1.put(key,oldVal+1);
            }
        }
        System.out.println(m1.toString());


        for (int i=0;i<input2.length();i++)
        {
            int oldVal=0;
            char key = input2.charAt(i);
            if (!m2.containsKey(key)) {
                m2.put(key,1);
            }
            else {
                oldVal=m2.get(key);
                m2.put(key,oldVal+1);
            }
        }

        System.out.println(m2.toString());
        if (m1.toString().equals(m2.toString())) {
            System.out.println(input1 + " and " + input2 + " are anagrams");
        }
        else System.out.println(input1 + " and " + input2 + " are not anagrams");


    
    }
}