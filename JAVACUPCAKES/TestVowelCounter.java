import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestVowelCounter{

    @Test
    public void testThatFunctionCollectsString(){
    
        String name="Alhaja";
        
        int [] expected = VowelCounter.countVowel(name);
        int [] actual = {3,3};
        
        assertArrayEquals(expected,actual); 
        
    }
    
    @Test
    public void testThatCharacterAtEvenPositionIsAccurate(){
    
        String name="Alhaja";
        
        String expected = VowelCounter.getCharacterAtEvenPosition(name);
        String actual = "laa";
        
        assertEquals(expected,actual); 
        
    }
    
    @Test
    public void testThatFactorialisEqual(){
    
        int number=7;
        int expected = VowelCounter.getFactorial(number);
        int actual = 5040;
        
        assertEquals(expected,actual); 
        
    }
    
    @Test
    public void testThatResultOfCombinationIsEqual(){
    
        int firstNumber=7;
        int secondNumber=6;
        int expected = VowelCounter.getCombination(firstNumber, secondNumber);
        int actual = 7;
        
        assertEquals(expected,actual); 
        
    }
    
    @Test
    public void testThatFunctionReturnsZeroWhenSecondNumberIsGreaterThanFirst(){
    
        int firstNumber=7;
        int secondNumber=8;
        int expected = VowelCounter.getCombination(firstNumber, secondNumber);
        int actual = 0;
        
        assertEquals(expected,actual); 
        
    }
    
}
