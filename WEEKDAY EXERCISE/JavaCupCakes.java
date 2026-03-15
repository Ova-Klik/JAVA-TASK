import java.util.Arrays;
public class JavaCupCakes{

    
    public static boolean [] getEvenValue(int [] numbers){
    boolean [] evenValues = new boolean [numbers.length];
    
        for(int index=0; index<numbers.length;index++){
                
                if(numbers[index]%2==0){
                
                evenValues[index]=true;
                }else evenValues[index]=false;
                
        }
              return evenValues;  
    }
    
    public static int[] getDoubleLengthAndInput(int [] numbers){
        
        int [] newNumbers = new int [numbers.length*2];
        
        for(int index=0; index<numbers.length; index++){
        
            newNumbers[index]=numbers[index];
//            newNumbers[index+ numbers.length] = numbers[index]*2;
        }
        int count=0;
        for(int index=numbers.length; index<newNumbers.length;index++){
            
            newNumbers[index]=numbers[count]*2;
            count++;
            
        }
        
        return newNumbers;
    
}
}
