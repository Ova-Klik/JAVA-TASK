public class LargestAndSmallest{

    public static void main(String...args){
    
        int [] numbers= {23,34,55,22,89,12,34};
        
        int smallest = numbers[0];
        int largest = numbers[0];
        
        for(int index=1; index<numbers.length;index++){
        
            if(numbers[index]<smallest) smallest=numbers[index];
            if(numbers[index]>largest) largest=numbers[index];
            
        }
        
        System.out.println(largest);
        System.out.println(smallest);
    
    }
}
