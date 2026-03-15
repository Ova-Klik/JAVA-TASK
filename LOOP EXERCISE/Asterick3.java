public class Asteriks3{

    public static void main (String...args){
    
    int rows=5;
        for(int row=0; row<rows; row++){
        
            for(int space=5; space>row; space--){
                 System.out.print("  ");
            
            }
        
            for(int star=row+1; star>0; star--){
                System.out.print(star + " ");
               }
               
            System.out.print("  ");
            
            for(int star=row+1; star<=5; star++){
                System.out.print(star + " ");
               }
               
               
            System.out.print("  ");
            
         
            
            for(int star=0; star>rows-row+1; star++){
                System.out.print(star + " ");
               }
            
             System.out.print("  ");
             
             for(int space=rows-row; space>1; space++){
                 System.out.print("  ");
            
            }
             
             for(int star=1; star<=rows-row; star++){
                System.out.print(star + " ");
               }
            
             System.out.println();
        }
        
       
    
    
    }
 
}
