import java.util.Scanner;


public class PyramidPattern{
    public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
        
        System.out.print("Kindly enter number of rows: ");
        int numberOfRows = input.nextInt(); 

        for (int index= 0; index < numberOfRows; index++) {
           
            for (int secondIndex = 0; secondIndex < numberOfRows - index - 1; secondIndex++) {
                System.out.print("   "); 

           
            int number = 1;
            for (int thirdIndex = 0; thirdIndex <= index; thirdIndex++) {
                System.out.print(number + "   ");
                number*= 3;
            }

            
            number /= 9; 
            for (int thirdIndex = index - 1; thirdIndex >= 0; thirdIndex--) {
                System.out.print(number + "   ");
                number /= 3;
            }

           
            System.out.println();
        }
    }
}
}
