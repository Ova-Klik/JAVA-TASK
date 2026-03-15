import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class JavaCupCakeTest{

    @Test
    public void testThatFunctionReturnsTrueForEvenValuesAndFalseForBooleanValues(){
    
        int [] numbers={2,5,7,1,6,9};
        boolean []actual = JavaCupCakes.getEvenValue(numbers);
        boolean []expected = {true,false,false,false,true,false};
        
        assertArrayEquals(actual,expected);
    }
    
    @Test
    public void testThatFunctionReturnsDoubleLengthAndInput(){
    
        int [] numbers={2,5,7,1,6,9};
        int []actual = JavaCupCakes.getDoubleLengthAndInput(numbers);
        int []expected = {2,5,7,1,6,9,4,10,14,2,12,18};
        
        assertArrayEquals(actual,expected);
    }
}
