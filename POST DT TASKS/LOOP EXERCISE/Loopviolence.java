public class Loopviolence{

    public static void main(String...args){
    
    int spaces = 5;
    for(int row=1; row<=5; row++){
    
        for(int space=5; space>row; space--){
        
            System.out.print(" ");
        
        }
        for(int index=row; index>0; index-- ){
              
                 System.out.print("*");
                
                }
                
                System.out.println();
        }
        
                
    }
  }
  




