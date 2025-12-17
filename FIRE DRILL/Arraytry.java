import java.util.Scanner;

public class Arraytry{
    public static void main(String[ ]args){
    Scanner input = new Scanner(System.in);
    
    int sum=0;  
    
    int[] numbers = new int[6];
    
    for (int counter=0; counter<6;counter++){
        System.out.printf("Enter integer #%d: ", counter+1);
        numbers[counter]=input.nextInt();
        
        sum+=numbers[counter];
    }
        System.out.printf("sum of numbers in the collection is: %d\n", sum);
}
}

//        System.out.print("You entered: ");
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//

