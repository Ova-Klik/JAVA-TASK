
public class Loop{
    public static void main(String...args){
        
         int count=0;
         
         for(int index=2; index<=100; index++){
            
            boolean isPrime= true; 
             
            for(int doIndex=2; doIndex<index; doIndex++ ){
                
                if(index%doIndex==0){
                    
                    isPrime=false;
                    break;
                }
                }
                
                if(isPrime){
                count++;
                
                }
          }
          System.out.printf("Prime numbers between 1 to 100 = %d%n", count);
          
                
    }
    }

