import java.util.Scanner;

public class IntegerReverse{
public static void main(String[]args){

    
    int result= reverse();
    
    System.out.printf("%nThe reverse  is:  %d%n%n",result);


}

public static int reverse(){

Scanner input= new Scanner(System.in);

System.out.print("Enter to get its reverse: ");
int number=input.nextInt();
int reverse=0;
    while (number!=0){

        int digit=number%10;
        reverse=reverse*10 + digit;
        number = number/10;
 
}
return (reverse);
}
}
