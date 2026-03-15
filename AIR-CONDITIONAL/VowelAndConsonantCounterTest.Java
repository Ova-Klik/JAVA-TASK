import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VowelAndConsonantCounterTest{

    @Test
    public void testThatFunctionCollectsString(){
    
        String name="Alhaja";
        
        int [] expected = VowelAndConsonantCounter.countSounds(name);
        int [] actual = (3,3);
        
        asserArrayEquals(expected,actual); 
        
    }
    
}
