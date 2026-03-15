public class RangeOfLargestAndSecondLargest{
    

    public static int [] getSortedArray(int []numbers){
        
        for(int index=0; index<numbers.length-1;index++){
        
            int smallest=index;
            for(int count=index+1; count<numbers.length; count++){
                if(numbers[count]<numbers[smallest])smallest=count;
            
            }
            
            int temp=numbers[index];
            numbers[index]=numbers[smallest];
            numbers[smallest]=temp;
        }
        
        return numbers;
        
    }
    
    public static int getLargestNumber(int []numbers){
        
      numbers=getSortedArray(numbers);
      int largest=numbers[0];
      for(int index=numbers.length-1; index>0;index--){
                
                if(numbers[index]>largest) largest=numbers[index];
        
      }
      return largest;
        
    }
    
    public static int getSecondLargestNumber(int []numbers){
      numbers=getSortedArray(numbers);
      int largest=getLargestNumber(numbers);
      int secondLargest=numbers[numbers.length-1];
      for(int index=numbers.length-1; index>0;index--){
                
                if(numbers[index]==largest) secondLargest=numbers[index-1];
                    
      }
      return secondLargest;
        
    }
    
     public static int getSmallestNumber(int []numbers){
      numbers=getSortedArray(numbers);
      int smallest=numbers[0];
      for(int index=0; index<numbers.length;index++){
                
                if(numbers[index]<smallest) smallest=numbers[index];
        
      }
      return smallest;
        
    }
    
    public static int getSecondSmallestNumber(int []numbers){
      numbers=getSortedArray(numbers);
      int smallest=getSmallestNumber(numbers);
      int secondSmallest=numbers[numbers.length-1];
      for(int index=0; index<numbers.length;index++){
                
                if(numbers[index]==smallest) secondSmallest=numbers[index+1];
                    
      }
      return secondSmallest;
        
    }
    
    public static int getRangeOfSecondLargestAndSecondSmallest(int []numbers){
      numbers=getSortedArray(numbers);
      int secondLargest=getSecondLargestNumber(numbers);
      int secondSmallest=getSecondSmallestNumber(numbers);
      int range = secondLargest- secondSmallest;
      
      return range;
        
}
}
