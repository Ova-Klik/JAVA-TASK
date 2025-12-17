

import java.util.Scanner;

public class FindThief{
public static void main (String[] args){

String name=" ";

Scanner input=new Scanner(System.in);

while (!name.equalsIgnoreCase("Thief")) {

System.out.printf("Kindly enter your name: ");
name=input.nextLine().toLowerCase();
 
 }
 
System.out.printf("\n\nTHIEF%n"); 
System.out.printf("THIEF%n"); 
System.out.printf("THIEF%n%n"); 
System.out.printf("We Have caught the thief!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!%n");

}


}


