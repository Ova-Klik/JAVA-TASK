import java.util.Arrays;

public class LargestAndSmallest{

    public static void main(String...args){
    
        int [] numbers= {23,34,55,22,89,12,34};
        
        
       
      for(int index=0; index<numbers.length-1; index++){
               int smallest=index;
               
         for(int nextIndex=index+1; nextIndex<numbers.length; nextIndex++){
               
                if(numbers[nextIndex]<numbers[index]) smallest=nextIndex;
               }
            int container=numbers[index];
            numbers[index]=numbers[smallest];
            numbers[smallest]=container;
        
      }
        System.out.println(Arrays.toString(numbers));
        
    }
}
