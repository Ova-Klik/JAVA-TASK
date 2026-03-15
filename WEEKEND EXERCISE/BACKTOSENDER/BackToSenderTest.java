import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

    @Test
    public void testThatAmountPerParcelIsEqualAtLessThan50(){
    
        int successfulDelivery=25;
        int expectedAmountPerParcel=BackToSender.getAmountPerParcel(successfulDelivery);
        int actualAmountPerParcel= 160;
        
        assertEquals(actualAmountPerParcel,expectedAmountPerParcel);
    
    }
    
    @Test
    public void testThatAmountPerParcelIsEqualAt50To59(){
    
        int successfulDelivery=59;
        int expectedAmountPerParcel=BackToSender.getAmountPerParcel(successfulDelivery);
        int actualAmountPerParcel= 200;
        
        assertEquals(actualAmountPerParcel,expectedAmountPerParcel);
    
    }
    
    @Test
    public void testThatAmountPerParcelIsEqualAt60To69(){
    
        int successfulDelivery=69;
        int expectedAmountPerParcel=BackToSender.getAmountPerParcel(successfulDelivery);
        int actualAmountPerParcel= 250;
        
        assertEquals(actualAmountPerParcel,expectedAmountPerParcel);
    
    }
    
    @Test
    public void testThatAmountPerParcelIsEqualAt70Above(){
    
        int successfulDelivery=70;
        int expectedAmountPerParcel=BackToSender.getAmountPerParcel(successfulDelivery);
        int actualAmountPerParcel= 500;
        
        assertEquals(actualAmountPerParcel,expectedAmountPerParcel);
    
    }
    
    @Test
    public void testThatAmountPerParcelIs0At0(){
    
        int successfulDelivery=0;
        int expectedAmountPerParcel=BackToSender.getAmountPerParcel(successfulDelivery);
        int actualAmountPerParcel= 0;
        
        assertEquals(actualAmountPerParcel,expectedAmountPerParcel);
    
    }
    
    @Test
    public void testThatwageIs0At0successfulDelivery(){
    
        int successfulDelivery=0;
        double expectedWages=BackToSender.getWages(successfulDelivery);
        double actualWages= 0;
        
        assertEquals(actualWages,expectedWages);
    
    }
    
    @Test
    public void testThatwageIsEqualAtLessThan50successfulDelivery(){
    
        int successfulDelivery=49;
        double expectedWages=BackToSender.getWages(successfulDelivery);
        double actualWages= 12840;
        
        assertEquals(actualWages,expectedWages);
    
    }
    
    @Test
    public void testThatwageIsEqualAt50To59successfulDelivery(){
    
        int successfulDelivery=55;
        double expectedWages=BackToSender.getWages(successfulDelivery);
        double actualWages= 16000;
        
        assertEquals(actualWages,expectedWages);
    
    }
    
    @Test
    public void testThatwageIsEqualAt60To69successfulDelivery(){
    
        int successfulDelivery=60;
        double expectedWages=BackToSender.getWages(successfulDelivery);
        double actualWages=20000;
        
        assertEquals(actualWages,expectedWages);
    
    }
    
    @Test
    public void testThatwageIsEqualAt70AbovesuccessfulDelivery(){
    
        int successfulDelivery=75;
        double expectedWages=BackToSender.getWages(successfulDelivery);
        double actualWages=42500;
        
        assertEquals(actualWages,expectedWages);
    
    }

}
