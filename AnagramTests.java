import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTests {
    @Test
    public void isAnagram(){
     String input1="istanbul";
     String input2="bustnail";
     assertTrue(Anagram.isAnagram(input1,input2));
    }

    @Test
    public void isNotAnagram(){
    String input1="istanbul";
    String input2="constantinople";
    assertFalse(Anagram.isAnagram(input1,input2));
    }

}
