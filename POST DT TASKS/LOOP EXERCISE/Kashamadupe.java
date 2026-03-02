public class Kashamadupe{

    public static void main(String...args){
    
    String word="KASHAMADUPE";
   
    
    for(int row=0; row<word.length(); row++){
        
        for(int space=0; space<row;space++){
        
        System.out.print(" ");
        }
        for(int count=row; count<word.length(); count++){
            
            System.out.print(word.charAt(count));
           
        
        }
        System.out.println();
    }
    
    
    }
    
}





