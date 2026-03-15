public class VowelCounter{

         
        
    public static int []countVowel(String input){
        int [] check= new int [2];
        int vowelCount=0;
        int consonantCount=0;
        for(int index = 0; index<input.length(); index++){
            char letter= input.charAt(index);
            if(letter=='a' || letter=='e' || letter=='i' ||letter=='o' || letter=='u'|| 
                letter=='A'|| letter=='E'|| letter=='I'|| letter=='O'|| letter=='U'){
                
                vowelCount++;
            }else consonantCount++;
    }
        
                check[0]=vowelCount;
                check[1]=consonantCount;
                return check;
            
    }
    
    public static String getCharacterAtEvenPosition(String input){
        
        String evenPositionCharacter="";
        for(int index = 0; index<input.length(); index++){
            
            if((index+1)%2==0)evenPositionCharacter+=input.charAt(index);
                
    }
                return evenPositionCharacter;
    }
    
    public static int getFactorial(int number){
        int factorial=1;
       
        while(number>1){
        
            factorial*=number;
            number--;
        }
        return factorial;
   
    }
    
    public static int getCombination(int firstNumber,int secondNumber){
        int nNumber= getFactorial(firstNumber);
        int rNumber= getFactorial(secondNumber);
        
        if(rNumber>nNumber){
            return 0;
        }else{
        
            int difference = getFactorial(firstNumber-secondNumber);
            int combination = nNumber/(difference*rNumber);
       
            return combination;
        }
        
        
       
   
    }
}
