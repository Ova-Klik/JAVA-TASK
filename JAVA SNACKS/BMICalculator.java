import java.util.Scanner;

public class BMICalculator{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.printf("To Calculate BMI in Pounds/Inches: PRESS 'A' %nTo Calculate BMI in Kilogram/Meters: PRESS 'B' " );
char check = input.next().charAt(0);


if (check=='A'){ 

System.out.print("PLease Enter Weight in Pounds");
double weight = input.nextDouble();

System.out.print("PLease Enter Height in Inches");
double height = input.nextDouble();

double BMIp = (weight * 703)/(height * height);

System.out.printf("Your BMI is %.2f%n%n", BMIp);

System.out.println("Confirm your Status");

System.out.printf("%-6s %s%n", "Less Than 18.5", "Underweight");
System.out.printf("%-6s %s%n", "18.5 - -24", "Healthy, Normal");
System.out.printf("%-6s %s%n", "25.0 - -29.9", "Overweight");
System.out.printf("%-6s %s%n", "30.0 - -34.9", "Obesity Class I");
System.out.printf("%-6s %s%n", "35.0 - -39.9", "Obesity Class II");
System.out.printf("%-6s %s%n", "40.0 - -above", "Obesity Class III, Extreme/Severe");



}else if(check=='B'){

System.out.print("PLease Enter Weight in Kilogram ");
double weightK = input.nextDouble();

System.out.print("PLease Enter Height in Meters ");
double heightK = input.nextDouble();

double BMIk = (weightK)/(heightK * heightK);

System.out.printf("Your BMI %.2f%n%n", BMIk);

System.out.println("Confirm your Status");

System.out.printf("%-6s %s%n", "Less Than 18.5", "Underweight");
System.out.printf("%-6s %s%n", "18.5 - -24", "Healthy, Normal");
System.out.printf("%-6s %s%n", "25.0 - -29.9", "Overweight");
System.out.printf("%-6s %s%n", "30.0 - -34.9", "Obesity Class I");
System.out.printf("%-6s %s%n", "35.0 - -39.9", "Obesity Class II");
System.out.printf("%-6s %s%n", "40.0 - -above", "Obesity Class III, Extreme/Severe");

}else{
 
System.out.printf("Invalid input%n");

}


}

}
