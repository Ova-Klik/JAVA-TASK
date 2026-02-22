import java.util.Scanner;

public class Hello{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    
     System.out.println(" ");
    
    for(int index=0; index<5; index++){
    
    System.out.println("\"Hello World\"");
    
    }
    
    System.out.println(" ");



    
    for(int index=0; index<6; index++){
    
    System.out.println("\"Queen's\"" + "\"College\"");
    
    }
    
      System.out.println(" ");
    



    for(int index=0; index<7; index++){
    
    System.out.println("\"Date of Birth:" + "\"28\\03\\2004\"");
    
    }


    
    
     for(int index=100; index<201; index++){
        
        if(index%4==0 && index%6==0){
            System.out.println("\"Hello World\"");
    
            }else if(index%4==0 && index%6!=0){
                
                 System.out.println("\"Hello\"");
           
            }else if(index%4!=0 && index%6==0){
            
                System.out.println("\" World\"");
            
            }else{
                  System.out.println(index);
            
            }
            
            }
            
            
            
            
      
        System.out.println("Kindly enter number: ");
        int number= input.nextInt();
        
        if(number<1000){
            System.out.printf("$%d", number);
    
            }else if(number>1000){
                
                 System.out.printf("%,d", number);
           
            }




        System.out.println("Kindly enter number: ");
         double numbers= input.nextDouble();
        double result = numbers * 100;
         
         System.out.println(numbers*100));

                if (result == (int) result){
                    System.out.printf("%n %.0f%% %n", result);
                }else{
                    System.out.println(result + "%");
    
   }
    }
    }

