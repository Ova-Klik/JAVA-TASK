import java.util.Scanner;

public class WeekendTask1{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

    for(int index=1; index<101; index++){
    
        if(index%2==0){
        System.out.print(index);
        System.out.print(" ");
       }
    }
    
    
    for(int index=50; index<101; index++){
    
        if(index%2!=0){
        System.out.print(index);
        System.out.print(" ");
        
       }
    }
    
    for(int index=100; index>0; index--){
    
       
        System.out.println(index);
       
        
       }
    }

    
        for(int index=1; index<=20; index++){
    
       
        System.out.println(index*index);
       
        
       }
    }
    
    for(int index=1; index<=50; index++){
    
        if(index%3==0){
        System.out.println(index);
       }
        
       }
    
    
    for(int index=1; index<=100; index++){
    
        if(index%3==0 && index%5==0  ){
        System.out.println(index);
       }
        
       }
       
          for(int index=1; index<=100; index++){
    
        if(index%3==0 && index%5==0  ){
        System.out.println(index);
       }
        
       }
       
       
       int count=0;
       for(int index=1; index<=100; index++){
       
        if(index%7==0){
        count+=1;
        System.out.println("number"+" " + index + " " + "is divisble by 7");
        
       }
        
       }
        System.out.println(" ");
       System.out.println("counts=" + count);

        int sum=0;
        for(int index=1; index<=50; index++){
       
            sum+=index;        
       }
        System.out.println("Total of first 50 natural numbers = "+ sum);

         int sum=1;
            for(int index=1; index<=10; index++){
                sum*=index;        
           }
            System.out.printf("%n Product of first 10 natural numbers = %,d %n%n",  sum);
        
        
         
        for(int index=65; index<=90; index++){
        
        char letter= (char)(index);
        System.out.print(letter);
        System.out.print(" ");
                 
       }
        
        System.out.print("Enter Number to get multiplication Table: ")
        int number= input.nextInt();
        
        for(int index=1; index<=12; index++){
        
        
        System.out.printf("%d x %d = %d%n", number , index, (number * index));
       
                 
       }
       
       
        String word="Character";
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        System.out.printf("\'%c\'%n", letter);
       
                 
       }
       
        System.out.print("Enter word to know number of occurence of letter e: ");
        String word=input.nextLine();
        int count=0;
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter=='e'){ 
        count++;
       
           }
      
       } if(count<=1){
            System.out.printf("Letter 'e' appeared %d time %n", count); 
        
        }else{
            System.out.printf("Letter 'e' appeared %d times %n", count); 
        
        }
        
        System.out.print("Enter word to chnage all lower letter to upper: ");
        String word=input.nextLine();
        String newWord="";
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter>=97 && letter <=122){ 
            char capLetter= (char)(letter - 32);
            newWord+=capLetter;
                    
           }else{
             newWord+=letter;
        }
        
       }
       System.out.printf("%nThe new ALL-CAPS word is: %s%n", newWord);


        System.out.print("Enter word to chnage all lower letter to upper: ");
        String word=input.nextLine();
        String newWord="";
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter>=65 && letter<=90){ 
            char capLetter= (char)(letter + 32);
            newWord+=capLetter;
                    
           }else{
             newWord+=letter;
        }
        
       }
       System.out.printf("%nThe new lowercase word is: %s%n", newWord);
       
        System.out.print("Enter word to confirm how many vowels therein: ");
        String word=input.nextLine();
        String newWord="";
        int count=0;
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter>=65 && letter<=90){ 
            char capLetter= (char)(letter + 32);
            newWord+=capLetter;
                    
           }else{
            newWord+=letter;
        }
        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ){
        
        count++;
        
        }
       }
      
        System.out.printf("The word contains %d vowels%n", count);



          System.out.print("Enter a number: ");
          String numbers =input.nextLine();
          int count=0;
          int number=0;
          
         for(int index=0; index<=numbers.length()-1; index++){
             number= numbers.charAt(index)-'0';
             count++;
          System.out.printf("%ndigit : %d%n", number);       
       
       }
            System.out.printf("%nNumber of digits = %d%n", count); 
            
            

          System.out.print("Enter a number: ");
          String numbers =input.nextLine();
          int sum=0;
          
          for(int index=0; index<=numbers.length()-1; index++){
             sum+= numbers.charAt(index)-'0';
       
       }
            System.out.printf("%nSum of all digits in your number = %d%n", sum); 
            
            
    }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
