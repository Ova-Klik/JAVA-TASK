import java.util.Scanner;

public class TemperatureConverter{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.println("Enter Temperature in Kelvin ");
double  kelvinTemp = input.nextDouble();

double celciusTemp= kelvinTemp-273.15;
double fahrenheitTemp= (kelvinTemp-273.15) * 9/5 + 32;

System.out.printf("Your Temperature in KELVIN is = %.2f%n", kelvinTemp);
 
System.out.printf("Your Temperature in CELCIUS is = %.2f%n", celciusTemp);
 
System.out.printf("Your Temperature in FAHRENHEIT is = %.2f%n",fahrenheitTemp);



}

}
