import java.util.Scanner;

// 5C2 = 5!/(5-2)!2!
public class War{

        static Scanner input= new Scanner(System.in);
    
        public static void main(String...args){
            String inputs="1";
            double DegreeInCelcius=100;
            
            getUserInput(inputs);
            
            System.out.printf("Celcius -------> Fahreinheit%n%n");
            convertCelciusDegreeToFahreint(DegreeInCelcius);
        }
       
    public static void getUserInput(String inputs){
        
        
        while(!inputs.equalsIgnoreCase("0")){
            System.out.println("Kindly enter any number Or (enter 0 to stop)");
            inputs=input.nextLine();
        }     
    
    }
    
    public static void convertCelciusDegreeToFahreint( double number){
        
        for(double count=0; count<=number; count+=2){
                double fahrenheit= (count*9/5)+32;
                System.out.printf("%5.0f --------> %.2fF%n", count,fahrenheit);
        }
        
    
    }
    
    public static void convertCelciusDegreeToFahreint( double number){
        
        for(double count=0; count<=number; count+=2){
                double fahrenheit= (count*9/5)+32;
                System.out.printf("%5.0f --------> %.2fF%n", count,fahrenheit);
        }
        
    
    }
};
