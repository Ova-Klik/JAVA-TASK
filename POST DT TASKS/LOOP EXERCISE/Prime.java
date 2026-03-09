import java.util.Scanner;

public class Prime{
    
    public static void main(String...args){
        
         Scanner input= new Scanner(System.in);
         System.out.print("Enter a number");
         int number= input.nextInt();
         
         boolean result=checkPrime(number);
          
          if(result=false){
            System.out.println("Number is not prime");
          
          }else{
            System.out.println("Number is prime");
          
          }
            
   }
       
   public static boolean checkPrime(int number){
    boolean numberIsPrime=true;
    int divisor=2;
    
       while(divisor<=number){
       
            if(number%divisor!=0){
                divisor++;
           
                
            }else{
                 numberIsPrime=false;
                 break;
            }
        }
        return numberIsPrime;
        
        
    }
}
