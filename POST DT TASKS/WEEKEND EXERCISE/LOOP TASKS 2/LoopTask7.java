
public class Loop{
    public static void main(String...args){
        
        double average=0.0;
        int sum=0;
        double index=1;
      
        for(; index<=100;index++){
                
                sum+=index;
                
         }
         average= sum/index;
                
        System.out.printf("%nSum is : %d%n",sum);
        System.out.printf("%nAverage is : %.2f%n",average);
        
    }
    }

