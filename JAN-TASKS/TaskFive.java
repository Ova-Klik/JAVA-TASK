public class TaskFive{

    public static void main (String...args){
    
    int multiplesOfFour=0;
    
//    for(int index=1; index<3; index++){
//           System.out.println("Checking" + index);
//            multiplesOfFour= 4*index;
//             System.out.println("Another Checker"+index);
//            
//           for(int count=0;count<5; count++){
//           System.out.println("sasdf" + index);
//            System.out.print(multiplesOfFour);
//            System.out.println("wqefgv"+index);
//                       }
//         System.out.print(" ");  
//       
//    }
//


        for(int index = 1; index <= 10; index++){
        
            if (index % 4 == 0){
                for(int count =1; count <=5; count++){
                    System.out.print(index);
                }
                System.out.print(" ");
            }                            
            
        }
     
    }
       
    }

