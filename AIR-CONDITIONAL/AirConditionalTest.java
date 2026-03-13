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
    public void testTemperatureIsZeroWhenPowerOff(){
    
        int state = 0;
        int temperature = 0;
        boolean expected = true;
        boolean result = ac.getAirConditonalTemperatureAtPowerOff(state,temperature);
        
        assertEquals(expected,result);
    }
    
    @Test
    public void testAirConditionalIsPoweredOnAndTemperatureIsAtMaxForJetMode(){
    
        int state = 1;
        int temperature = 16;
        boolean expected = true;
        boolean result = ac.turnOnAirConditional(state,temperature);
        
        assertEquals(expected,result);
    }
    
    @Test
    public void testAirConditionalIncreasesTemperature(){
        
        int state = 1;
        int temperature = 16;
        int expected = 18;
        int result = ac.turnOnAirConditional(state,temperature, ADDTEMPERATURE);
        
        assertEquals(expected,result);
    }
    

}
