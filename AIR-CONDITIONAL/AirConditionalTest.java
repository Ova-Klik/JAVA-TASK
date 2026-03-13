import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionalTest{
    
    AirConditional ac;
    
    @BeforeEach
    public void setUp(){
    
        ac = new AirConditional();
    }

    @Test
    public void testThatAirConditionalIsPowerOff(){
    
        int state = 0;
        
        boolean expected = false;
        boolean result = ac.getAirConditonalPowerStatus(state);
        
        assertEquals(expected,result);
    }
    
    @Test
    public void testThatTemperatureIsZeroWhenPowerOff(){
    
        int state = 0;
        int temperature = 0;
        boolean expected = true;
        boolean result = ac.getAirConditonalTemperatureAtPowerOff(state,temperature);
        
        assertEquals(expected,result);
    }
    
    @Test
    public void testThatAirConditionalIsPoweredOnAndTemperatureIsAtMaxForJetMode(){
    
        int state = 1;
        int temperature = 16;
        boolean expected = true;
        boolean result = ac.turnOnAirConditional(state,temperature);
        
        assertEquals(expected,result);
    }
    
    @Test
    public void testThatAirConditionalIncreasesTemperatureTwoDegreesOnOneClick(){
        
        int state = 1;
        int temperature = 16;
        int expected = 18;
        int result = ac.increaseTemperature(state,temperature, 1);
        
        assertEquals(expected,result);
    }
    
    @Test
    public void testThatAirConditionalDecreasesTemperatureTwoDegreesOnOneClick(){
        
        int state = 1;
        int temperature = 18;
        int expected = 16;
        int result = ac.decreaseTemperature(state,temperature, 1);
        
        assertEquals(expected,result);
    }
    

}
