public class AirConditional{

        
        final int powerOffTemperature=0;
        final int initialTemperature = 16;
        final int minTemperature = 16;
        final int maxTemperature = 30;
        final int ADDTEMPERATURE=2;
        final int DECREASETEMPERATURE=2;

    public boolean getAirConditonalPowerStatus(int state){

        int isOff = 0;
        int isOn = 1;

        if(isOff == state){
            return false;
        }
        else if(isOn == state){
            return true;
        }

        return false;
    }


    public boolean getAirConditonalTemperatureAtPowerOff(int state, int temperature){

        boolean powerStatus = getAirConditonalPowerStatus(state);

        if(powerStatus == false && temperature == powerOffTemperature){
            return true;
        }

        return false;
    }


    public boolean turnOnAirConditional(int state, int temperature){

        boolean powerStatus = getAirConditonalPowerStatus(state);
        boolean temperatureStatus = getAirConditonalTemperatureAtPowerOff(state, temperature);
        
        if(powerStatus==true && temperature==initialTemperature ){
        return true;
        }else return false;
    }
    
    public int increaseTemperature(int state, int temperature, int increament){

        boolean powerStatus = getAirConditonalPowerStatus(state);
        boolean temperatureStatus = getAirConditonalTemperatureAtPowerOff(state, increament);
        
        if(powerStatus==true && temperature>=minTemperature&& temperature<maxTemperature ){
        return temperature+ADDTEMPERATURE;
        }else return temperature;
    }
    
    

}
