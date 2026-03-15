import java.util.Scanner;

public class WeekendTask19and20{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string of digits to know the largest and smallest digit: ");
          String numbers =input.nextLine();
          
          getLargest(numbers);
          getSmallest(numbers);
          comparedigitstrings(numbers);
          
    
    }
    
        public static void getLargest(String numbers){
   
          int []digits=new int[numbers.length()];
            
          for(int index=0; index<=numbers.length()-1; index++){
            digits[index]= numbers.charAt(index)-'0';
       
       }
       
           int largest=digits[0];
       
       for(int index=1; index<digits.length; index++){
           
           if(digits[index]>largest)largest=digits[index];
       
       }
            System.out.printf("%nThe Largest digit = %d%n", largest); 
            
      } 
            
     public static void getSmallest(String numbers){
   
          int []digits=new int[numbers.length()];
            
          for(int index=0; index<=numbers.length()-1; index++){
                digits[index]= numbers.charAt(index)-'0';
       
       }
       
           int smallest=digits[0];
       
       for(int index=1; index<digits.length; index++){
           
           if(digits[index]<smallest)smallest=digits[index];
       
       }
            System.out.printf("%nThe Smallest digit = %d%n", smallest); 
            
            
      } 
            
     
     public static void comparedigitstrings(String numbers){
     
          int smallest=numbers.charAt(0)-'0';
          int largest=numbers.charAt(0)-'0';
             
          for(int index=1; index<=numbers.length()-1; index++){
               if(numbers.charAt(index)-'0'<smallest) smallest=numbers.charAt(index)-'0';
               if(numbers.charAt(index)-'0'>largest) largest=numbers.charAt(index)-'0';
       
       }
       
           
           System.out.printf("%nThe Largest digit = %d%n", largest);
           System.out.printf("%nThe Smallest digit = %d%n", smallest); 
     }
            
    }
