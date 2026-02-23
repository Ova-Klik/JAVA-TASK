
public class Loop{
    public static void main(String...args){
        
         
         System.out.printf("%nFirst 20 Fibonacci Numbers%n");
         
         int firstNumber=0;
         int secondNumber=1;
         
         for(int index = 1; index<=20; index++){
         
                System.out.println(firstNumber);
                int nextNumber=firstNumber + secondNumber;
                firstNumber=secondNumber;
                secondNumber= nextNumber;                
            
         }
  
          
                
    }
    }

