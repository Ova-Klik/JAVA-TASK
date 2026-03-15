import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeOfLargestAndSecondLargestTest{


    @Test
    public void testThatArrayIsSorted(){
        
        int[]numbers={2,5,7,1,6,9};
        int [] expectedSort= {1,2,5,6,7,9};
        int [] actualSort=RangeOfLargestAndSecondLargest.getSortedArray(numbers);
        
        assertArrayEquals(expectedSort,actualSort);
    }
    
    @Test
    public void testThatFunctionReturnedLargest(){
        
        int[]numbers={2,5,7,1,6,9};
        int expectedLargest=9;
        int actualLargest=RangeOfLargestAndSecondLargest.getLargestNumber(numbers);
        
        assertEquals(expectedLargest,actualLargest);
    

    }
    
    
    @Test
    public void testThatFunctionReturnedSecondLargest(){
        
        int[]numbers={2,5,7,1,6,9};
        int expectedsecondLargest=7;
        int actualsecondLargest=RangeOfLargestAndSecondLargest.getSecondLargestNumber(numbers);
        
        assertEquals(expectedsecondLargest,actualsecondLargest);
    

    }
    
    @Test
    public void testThatFunctionReturnedSmallest(){
        
        int[]numbers={2,5,7,1,6,9};
        int expectedsecondLargest=1;
        int actualsecondLargest=RangeOfLargestAndSecondLargest.getSmallestNumber(numbers);
        
        assertEquals(expectedsecondLargest,actualsecondLargest);
    

    }
    
    @Test
    public void testThatFunctionReturnedSecondSmallest(){
        
        int[]numbers={2,5,7,1,6,9};
        int expectedSecondSmallestNumber=2;
        int actualSecondSmallestNumber=RangeOfLargestAndSecondLargest.getSecondSmallestNumber(numbers);
        
        assertEquals(expectedSecondSmallestNumber,actualSecondSmallestNumber);
    

    }
    
    @Test
    public void testThatFunctionReturnedRangeOfSecondLargestAndSecondSmallest(){
        
        int[]numbers={2,5,7,1,6,9};
        int expectedRange=7-2;
        int actualRange=RangeOfLargestAndSecondLargest.getRangeOfSecondLargestAndSecondSmallest(numbers);
        
        assertEquals(expectedRange,actualRange);
    

    }
}


