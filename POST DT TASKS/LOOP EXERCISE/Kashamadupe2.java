public class Kashamadupe{

    public static void main(String...args){
    
    String word="KASHAMADUPE";
   
    
    for(int row=word.length()-1; row>=0; row--){
    
        for(int count=row; count<word.length(); count++){
            
            System.out.print(word.charAt(count));
           
        
        }
        System.out.println();
    }
    
    
    
    }
    
     
    
}





