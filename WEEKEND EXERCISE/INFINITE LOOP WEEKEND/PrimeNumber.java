
//    Guess the Number Game → Simulate a number guessing game using a loop. The "secret" number is fixed in the code. The user keeps guessing until they get it right, and the loop tells them if each guess is too high or too low to the fixed number.
//



import java.util.Scanner;

public class PrimeNumber{

    public static void main (String...args){
    
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a Number: ");
          int number= input.nextInt(); 
          int divisor=2;
          
          getPrimeNumbers(number);
          
          
    }
          
     public static boolean checkPrimeNumber(int number){    
          int divisor=2;
          boolean inputIsprime=true;
          
          while(divisor<number){
            
            if(number%divisor==0){
                inputIsprime=false;
                break;
            }
            
            divisor++;
            }
          
            return inputIsprime;
    }  
    
    public static void getPrimeNumbers(int number){
        boolean inputIsprime= checkPrimeNumber(number); 
        
        
        if(inputIsprime){
            System.out.println(number + " is a prime Number\n");
            System.out.println("Prime numbers from 1 to " + number + ":");
            
            for (int check = 2; check <= number; check++) {

            if (checkPrimeNumber(check)) {
            
                System.out.print(check + " ");
            }
        }
            System.out.println();
        }else{
            System.out.println(number + " is not a prime Number\n");
        }
        
    }
              
            
}     

 
