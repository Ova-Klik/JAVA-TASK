import java.util.Scanner;

public class IsPalindrome{
    public static void main(String[] args){
    
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter integer number: ");
    int number = input.nextInt();
    
    int reversedNumber=reverse(number);
    boolean isPalindrome=palindrome(number);
    
    System.out.printf("%nThe reverse of the number is :%d%n ", reversedNumber);
    
    if (isPalindrome){
    
        System.out.println("Number is a palindrome");
    }else {
    
            System.out.println("Number is not a palindrome");
    }
    
    }
    
    public static boolean palindrome(int number){
    
    return number == reverse(number);
    
        }
    
    public static int reverse(int number){
    
    int reverse =0;
    
    while (number!=0){
            int digit=number%10;
            reverse=reverse * 10 + digit ;
            number=number / 10;
        }
        
        return reverse;
    }
   }
