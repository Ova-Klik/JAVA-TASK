import java.util.Scanner;

public class PizzaWahala{
    static Scanner input = new Scanner(System.in);
    
    public static void main(){
    int run = 1;
    while(run==1){
    String pizzaMenu="""

                                ____________IYA SCAMBIRAH PIZZA____________
                        
                        _____________________________________________________________           
                        |               |                       |                   |
                        |   Pizza type  |   Number of Slices    |   Prices per Box  |
                        |_______________|_______________________|___________________|
                        |               |                       |                   |
                        |   Sapa Size   |       4               |   2,000           |
                        |_______________|_______________________|___________________|
                        |               |                       |                   |
                        |   Small Money |       6               |   2,400           |
                        |_______________|_______________________|___________________|
                        |               |                       |                   |
                        |   Big Boys    |       8               |   3,000           |
                        |_______________|_______________________|___________________|
                        |               |                       |                   |
                        |   Odogwu      |       12              |   4,200           |
                        |_______________|_______________________|___________________|          
                        

          """;
          
          System.out.print(pizzaMenu);
          managePizzaApp();
          
    }
    }
    
    
    public static int getNumberOfSlices(String pizzaType){
        
        if(pizzaType.equalsIgnoreCase("sapa size") || pizzaType.equals("1")) return 4;
        if(pizzaType.equalsIgnoreCase("small money") || pizzaType.equals("2")) return 6;
        if(pizzaType.equalsIgnoreCase("big boys") ||  pizzaType.equals("3")) return 8;
        if(pizzaType.equalsIgnoreCase("odogwu") || pizzaType.equals("4")) return 12;
        
        return 0;
    }
    
    public static int getPricePerBox(String pizzaType){
        
        if(pizzaType.equalsIgnoreCase("sapa size") || pizzaType.equals("1")) return 2000;
        if(pizzaType.equalsIgnoreCase("small money") || pizzaType.equals("2")) return 2400;
        if(pizzaType.equalsIgnoreCase("big boys") ||  pizzaType.equals("3")) return 3000;
        if(pizzaType.equalsIgnoreCase("odogwu") ||  pizzaType.equals("4")) return 4200;
        
        return 0;
    }
    
    public static int getNumberOfBoxes(String pizzaType, int numberOfPersons){
    
        int numberOfSlices= getNumberOfSlices(pizzaType);
        int numberOfBoxes= (int) Math.ceil((double) numberOfPersons/numberOfSlices);
        
        return numberOfBoxes;
        
    }
    
    public static int getRemainingSlices(String pizzaType, int numberOfPersons){
        int numberOfSlices= getNumberOfSlices(pizzaType);
        int numberOfBoxes= getNumberOfBoxes(pizzaType, numberOfPersons);
        int slicesRemaining= (numberOfBoxes * numberOfSlices) - numberOfPersons;
        
        return slicesRemaining;
        
    }
    
    public static double getTotalPrice(String pizzaType, int numberOfPersons){
        int pricePerBox= getPricePerBox(pizzaType);
        int numberOfBoxes= getNumberOfBoxes(pizzaType, numberOfPersons);
        double totalPrice= numberOfBoxes * pricePerBox;
        
        return totalPrice;
        
    }
    
    public static void managePizzaApp(){
      
        System.out.print("Kindly number of guests: ");
        int numberOfPersons= input.nextInt();
        input.nextLine();
        
        System.out.print("Kindly enter type of pizza: ");
        String pizzaType= input.nextLine().trim();
        
        int numberOfBoxes=getNumberOfBoxes(pizzaType, numberOfPersons);
        int remainingSlices=getRemainingSlices(pizzaType, numberOfPersons);
        int pricePerBox= getPricePerBox(pizzaType);
        double totalPrice= getTotalPrice(pizzaType, numberOfPersons);
        
        System.out.printf("%nNumber of Boxes needed = %d%n", numberOfBoxes);
        System.out.printf("Number of left over slices after serving = %d%n", remainingSlices);
        System.out.printf("Price = ₦%,.2f (explanation : ₦%d per box for %d boxes)%n", 
                            totalPrice,
                            pricePerBox,
                            numberOfBoxes);
    }
    

}
