

public class Banana{
     static String word= "car";   
     static String output=" ";
    public static void main(String...args){
    
      String input= "Banana";
      
      int number= 2;
     
      String output2=" ";
      System.out.println(input.length());
      
      String multipleString=getMultiple(word, number);
      System.out.println(multipleString);
      
      }
      public static String getMultiple(String word, int number){
      
       for(int index=0;index<word.length();index++){
            
            for(int index2=0;index<numberindex2++){
                output+=(char)word.charAt(index);
                
            }
            
        }
        return output;
        }
        
    }



