//    ATM Simulator → Simulate a simple ATM using a loop. Start with a balance of #1000. In each iteration, 
//ask the user to deposit, withdraw, or check balance. The loop should only stop when the user chooses to exit. Make sure withdrawals don't exceed the available balance.

import java.util.Scanner;
public class ATMSimulator{

        static int balance=1000; 
        static int option=0;
        static Scanner input= new Scanner(System.in);
        static MyMethods convert = new MyMethods();
        
    public static void main(String...args){
    
    
       
        int start= 1;
        
        
        while(start!=0){

            String  ATMMenu = """
                                       
                                    --ATM Simulation System--

                                        1. Deposit Money
                                        2. Withdraw Money
                                        3. Check Balance
                                        
                                        0. Exit
                    """;

            System.out.print(ATMMenu);
            System.out.printf("%nEnter operation(0-3): ");
            String ATMMenuOption = input.nextLine();
            
            
            if(ATMMenuOption.matches("^[0-3]$")){
                option=convert.stringToInteger(ATMMenuOption);
               
                if(option==0){
                    System.out.printf("%nThank you for banking with us...%n%n");
                    break;
                }}else{
                 System.out.println("\t Invalid input\n");
            
        
        }
                getOperation(option);
        
        }
        }
        
        
        public static void getOperation(int option){
        
        switch(option){
        
            case 1->{
                        System.out.printf("%nKindly enter amount to Deposit: ₦");
                        int amount= input.nextInt();
                        input.nextLine();
                        balance=deposit(amount, balance);
            }
            case 2->{
                        System.out.printf("%nKindly enter amount to Deposit: ₦");
                        int amount= input.nextInt();
                        input.nextLine();
                        balance=withdraw(amount, balance);
                        
            }
            case 3->    System.out.printf("%nBalance: ₦%,d",balance);
            
            default -> System.out.println("\t Invalid input\n");
            
        
        }
        }
        
        
        public static int withdraw(int amount, int balance){
        
                if(amount>balance){
                
                    System.out.println("\t Insufficient fund...\n");
                }else{
                
                    balance-=amount;
                    System.out.printf("%nWithdrawal of ₦%,d Successful...%n", amount);
                }
                
                return balance;
        }

        public static int deposit(int amount, int balance){
                
                    balance+=amount;
                    System.out.printf("%nDeposit of ₦%,d Successful...%n", amount);
                    
                    
                return balance;
                }
                
                
                
                
}


