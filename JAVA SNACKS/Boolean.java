import java.util.Scanner;

public class Boolean{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.print("Enter a Number ");
int  number = input.nextInt();
int square = number * number;

if (number>100 && number*number>100){

System.out.println("The number and it's Square is greater than 100 ");

}else if(number ==100 && square == 100) {

System.out.println("The number and it's Square is equal to 100 ");
}
else if(number<100 && square<100) {

System.out.println("The number and it's Square is less to 100 ");
}
else {

System.out.println("The number and it's Square is not equal to 100 ");
}


}

}
