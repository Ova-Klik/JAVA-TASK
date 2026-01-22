public class FireDrill{

    public static void main (String...args){
    
        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
        
        TaskOne(numbers);
        TaskTwo(numbers);
        TaskThree(numbers);
        TaskFour(numbers);
        TaskFive();
        TaskSix(numbers);
        TaskSeven();
    
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
        
        public static void TaskFour( int [] numbers){
        
         System.out.println("All even numbers:");
        for(int index=0; index<numbers.length; index++){
            
            if(numbers[index]%3==0){
            
                System.out.printf("%d ", numbers[index]);
            
            }else{
                    numbers[index]= 0;
                System.out.printf("%d ", numbers[index]);
            
            }
        }
        System.out.println(" ");
            return()
        }
        
        public static void TaskFive( ){
        int [] newNumbers={3,6,9};
        
         System.out.println("Multiples of 3 non zero:");
        for(int index=0; index<newNumbers.length; index++){
            
            if(newNumbers[index]%3==0){
                
                for(int count=0; count<4; count++){
                
              
                System.out.printf("%d ", newNumbers[index]);
            
            }
            }
        }
        System.out.println(" ");
        
      
        }
        
        public static void TaskSix(int [] numbers){
        
        
          System.out.println("Square of value:");
        for(int index=0; index<numbers.length; index++){
            
            if(numbers[index]%3==0){
            
                System.out.printf("%d ", (numbers[index]*numbers[index]));
            
            }else{
                    numbers[index]= 0;
                System.out.printf("%d ", numbers[index]);
            
            }
        }
        System.out.println(" ");
}

        public static void TaskSeven(){
        int [] TaskSixValues={0,0,9,0,0,36,0,0,81,0};
        int destination= TaskSixValues.length/2;
        int [] HalfOfValue = new int [destination];
        
          System.out.println("Added Pairs:");
          
         HalfOfValue[0]= TaskSixValues[0]+TaskSixValues[1];
         HalfOfValue[1]= TaskSixValues[2]+TaskSixValues[3];
         HalfOfValue[2]= TaskSixValues[4]+TaskSixValues[5];
         HalfOfValue[3]= TaskSixValues[6]+TaskSixValues[7];
         HalfOfValue[4]= TaskSixValues[8]+TaskSixValues[9];
         
        for(int index=0; index<HalfOfValue.length;index++){
        
            System.out.printf("%d ", HalfOfValue[index]);
        
        }
       
}
}
