import java.util.Map;
import java.util.HashMap;
public class Anagram {
    public static void main(String[] args)
    {
        isAnagram("istanbul","bustnail");
    }

    public static boolean isAnagram(String input1, String input2){
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        countOccurences(input1,m1);
        countOccurences(input2,m2);

        if (m1.toString().equals(m2.toString())) {
            System.out.println(input1 + " and " + input2 + " are anagrams");
            return true;
        }
        else System.out.println(input1 + " and " + input2 + " are not anagrams");
        return false;
    }

    public static void countOccurences(String input, Map<Character, Integer> m){
        for (int i=0;i<input.length();i++)
        {
            int oldVal;
            char key = input.charAt(i);
            if (!m.containsKey(key)) {
                m.put(key,1);
            }
            else {
                oldVal= m.get(key);
                m.put(key,oldVal+1);
            }
        }
    }


}