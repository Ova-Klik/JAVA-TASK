public static void multiply(String word, int number){
      
        for(int index=0;index<word.length()-1; index++){
        
            char newWord=word.charAt(index);
            String output+= (char)newWord * number;
            
            return (output);
            
      
      }
    
    }
