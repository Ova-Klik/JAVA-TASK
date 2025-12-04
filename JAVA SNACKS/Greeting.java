import java.util.Scanner;

public class Greeting{
public static void main (String[] args){
Scanner input=new Scanner(System.in);

System.out.print("Please enter your first name: ");
String firstName = input.nextLine();
System.out.print("Please enter your second name: ");
String lastName =input.nextLine();


System.out.printf("Hello,   %s  %s%n", firstName, lastName);



}

}
