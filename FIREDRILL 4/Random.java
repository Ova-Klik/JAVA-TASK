import java.util.Random;

public class RandomNumbers{

    public static void main (String...arguments){
    
    Random random =  new Random(10);
    
    int number= random.nextInt();
    
    System.out.print(number);
    }
}
