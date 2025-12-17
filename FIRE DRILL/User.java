

import java.util.Scanner;

public class User{
public static void main (String[] args){

Scanner input=new Scanner(System.in);




for(int count=1;count<=10;count++){


System.out.printf("Kindly input name %d%n:", count);
String user=input.nextLine();
System.out.printf("Kindly input your score %d%n:", count);
double score=input.nextDouble();

}

System.out.printf("The name and score collected");
}


}
