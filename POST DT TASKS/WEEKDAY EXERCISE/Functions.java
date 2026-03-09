public class ArrayFunctions{


    public static void main(String...args){
    
        int [] numbersA={2,1,6,3,4};
        int [] numbersB={10,5,4,8,15};
        
        displayEven(numbersA);
        displayEven(numbersB);
        
        
        }
        public static void displayEven(int []numbers){
        int length=numbers.length;
        
            for(int index=0; index<length-1; index++){
            
                smallest=index;
                for(int count=index+1; count<length; count++){
                    
                    if(numbers[count]<numbers[index]){
                    
                        smallest=count;
                    }    
                    }
                    
                    int container=numbers[index];
                    numbers[index]=numbers[smallest];
                    numbers[smallest]=container;
            }
            
            for(int index=0; index<length; index++){
                if(numbers[index]%2==0){
                System.out.print(numbers[index]);
        }
        }
        
    
    
    }
}
