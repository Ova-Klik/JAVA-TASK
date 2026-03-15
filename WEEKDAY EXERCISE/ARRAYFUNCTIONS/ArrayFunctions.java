import java.util.Arrays;
public class ArrayFunctions{


    public static void main(String...args){
    
        int [] numbersA={2,1,6,3,4};
        int [] numbersB={10,5,4,8,15};
        
        System.out.println(Arrays.toString(getEven(numbersA)));
        System.out.println(Arrays.toString(getEven(numbersB)));
        
       } 
       
        public static int [] sortArray(int []numbers){
        int smallest=0;
            for(int index=0; index<numbers.length-1; index++){
             smallest=index;
            
            for(int count=index+1; count<numbers.length; count++){
            
                    if(numbers[count]<numbers[smallest]){
                    
                    smallest=count;
                    }
            }
            int container = numbers[index];
            numbers[index]= numbers[smallest];
            numbers[smallest]= container;                
        }
         return numbers;   
    }
    
        public static int[] getEven(int []numbers){
        sortArray(numbers);
        int count=0;
         for(int index=0; index<numbers.length; index++){
                    if(numbers[index]%2==0){
                    count++;
            }
        }
        
        int [] evens=new int [count];
        count=0;
         for(int index=0; index<numbers.length; index++){
                    if(numbers[index]%2==0){
                    evens[count]=numbers[index];
                    count++;
            }
        }
        
        return evens;
     
     }
}
