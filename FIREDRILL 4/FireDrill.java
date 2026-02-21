public class FireDrill{

    public static void main (String...args){
    
        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
        
        TaskOne(numbers);
        TaskTwo(numbers);
        TaskThree(numbers);
        TaskFour(numbers);
        TaskFive(numbers);
        TaskSix(numbers);
        TaskSeven(numbers);
    
    }
    
        public static void TaskOne(int [] numbers){
        
        
        System.out.print("All values:");
        for(int index=0; index<numbers.length; index++){
        
            System.out.printf("%d ", numbers[index]);
            
        }
        System.out.println(" ");
        }
        
        
        public static void TaskTwo(int [] numbers){
        
         System.out.print("All even numbers:");
        for(int index=0; index<numbers.length; index++){
            
            if(numbers[index]%2==0){
            
            System.out.printf("%d ", numbers[index]);
            
            }
        }
        System.out.println(" ");
        
        }
        
        public static void TaskThree( int [] numbers){
        
         System.out.print("All odd numbers:");
        for(int index=0; index<numbers.length; index++){
            
            if(numbers[index]%2!=0){
            
            System.out.printf("%d ", numbers[index]);
            
            }
        }
        System.out.println(" ");
        }
        
        public static int [] TaskFour( int [] numbers){
        
         System.out.println("All odd numbers with non to 0:");
        for(int index=0; index<numbers.length; index++){
            
            if(numbers[index]%3==0){
            
                System.out.printf("%d ", numbers[index]);
            
            }else{
                    numbers[index]= 0;
                System.out.printf("%d ", numbers[index]);
            
            }
        }
        
            return numbers;
        }
        
        public static void TaskFive( int [] numbers){
        int [] newNumbers=TaskFour(numbers);
        
         System.out.println("Multiples of 3 non zero:");
        for(int index=0; index<newNumbers.length; index++){
            
            if(newNumbers[index]!=0){
                
                for(int count=0; count<4; count++){
                
              
                System.out.printf("%d  ", newNumbers[index]);
            
            }
            }
        }
        System.out.println(" ");
        
      
        }
        
        public static int [] TaskSix(int [] numbers){
        int [] newNumbers=TaskFour(numbers);
        
          System.out.println("Square of value:");
        for(int index=0; index<newNumbers.length; index++){
            
            if(newNumbers[index]!=0){
            
                System.out.printf("%d ", (newNumbers[index]*newNumbers[index]));
            
            }else{
                    newNumbers[index]=0;
                 System.out.printf("%d ", newNumbers[index]);
            }
            
           
        }
          System.out.println(" ");
          return newNumbers;
       
}

        public static void TaskSeven(int [] numbers){
        int [] newNumbers=TaskSix(numbers);
        int destination= newNumbers.length/2;
        int [] HalfOfValue = new int [destination];
        
          System.out.println("Added Pairs:");
          
         int count=0;
        for(int index=0; index<HalfOfValue.length;index++){
            HalfOfValue[index]= newNumbers[count] + newNumbers[count+1];
            count+=2;
            
            System.out.printf("%d ", HalfOfValue[index]);
        
        }
       
}
}
