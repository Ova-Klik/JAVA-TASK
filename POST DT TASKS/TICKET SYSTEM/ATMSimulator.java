//    ATM Simulator → Simulate a simple ATM using a loop. Start with a balance of #1000. In each iteration, ask the user to deposit, withdraw, or check balance. The loop should only stop when the user chooses to exit. Make sure withdrawals don't exceed the available balance.

public class{

    public static void main(String...args){
    
    
        int balance=1000; 
        int option=0;
        int start= 1;
        
        Mymethod convert = new Mymethod();
        
        while(start!=0){

            String  ATMMenu = """
                                       
                                    --ATM Simulation System--

                                        1. Deposit Money
                                        2. Withdraw Money
                                        3. Check Balance
                                        
                                        0. Exit
                    """;

            System.out.print(ATMMenu);
            System.out.print("Enter operation(0-5): ");
            String ATMMenuOption = input.nextLine();
            
            
            if(bookATMMenuOption.matches("^[0-3]$")){
                option=convert.stringToInteger(ATMMenuOption);
                if(option==0){
                    System.out.printf("%nThank you for visiting the library...%n%n");
                    break;
                }else{
                 System.out.println("\t Invalid input\n");
            }
        
        }
    
    }

}
