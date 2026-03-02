public class Asterik{

    public static void main(String...args){
    
    int rows=5;
    
    for(int row=rows; row>0; row--){
        
        for(int index=row; index>=0;index--){
        
                System.out.print("*" + " ");
        }
        
            System.out.print("         ");
       
        for(int index=row; index<=0; index++){
            
            System.out.print("*" + " ");
            
        }
            System.out.print("   ");
            
            
        for(int index=0; index<row; index++){
            
            System.out.print("*" + " ");
            
        }
        
            System.out.print("       ");
        
        for(int index=row; index>=0;index--){
        
                System.out.print("*" + " ");
        
        }
            
            System.out.println();
    }
    
    }
}
