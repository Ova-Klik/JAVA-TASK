
public class Loop{
    public static void main(String...args){
        
         
         System.out.printf("%nAll prime number between 1 to 100%n");
         for(int index=2; index<=100; index++){
            
            boolean isPrime= true; 
             
            for(int doIndex=2; doIndex<index; doIndex++ ){
                
                if(index%doIndex==0){
                    
                    isPrime=false;
                    break;
                
                }
                }
                
                if(isPrime){
                System.out.println(index);
                
                }
          }
          
                
    }
    }

