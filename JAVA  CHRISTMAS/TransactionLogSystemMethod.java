import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLogSystemMethod{
    
    static Scanner input = new Scanner(System.in);
    static List<Map<String, Object>> transactionHistory=new ArrayList<>();
    static Map<String, Object> transactions=new LinkedHashMap<>();
    
    
    public static void main (String...args){
    
    double accountBalance=0;
  
  
    while (true){
    
    String accountMenu=("""
                            
                                         --Welcome to Transaction Log App--
                                           
                                           1. Deposit Money
                                           
                                           2. Withdraw Money
                                           
                                           3. Show transaction history
                                           
                                           4. Exit the App.
                                        
    
                       """);
    
    System.out.print(accountMenu);
   while (true){
        System.out.print("Enter Operation: ");
        String menuOption=input.next();
        
        
        if(!menuOption.matches("[1-4]")){
        
            System.out.println("\t Invalid Option!\n");
            continue;
        }
        
        int option=menuOption.charAt(0) - '0';
        input.nextLine();
        switch(option){
            case 1->
                    accountBalance=deposit(accountBalance);
            case 2->
                    accountBalance=withdrawal(accountBalance);
            case 3->
                    displayTransactionHistory(transactionHistory);
            case 4->{
                    System.out.println("\n\tThank you for using Transaction Log App\n\n");
                    System.exit(0);
                    
                    }
            default ->
                    System.out.println("\t Invalid Option!\n");
            
                }
            break;    
            }
    
        }
     
    }
    
    public static double deposit(double accountBalance){
    double amount=0;
    String formatExpression="^(?!0+(\\.0+)?$)\\d+(\\.\\d{1,2})?$";
    String date= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
    String time= LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm a"));
    
    while (true){
    
    
    System.out.print("Kindly enter amount to Deposit:$");
    String amountCollected= input.nextLine();
    
    if(!amountCollected.matches(formatExpression)){
        System.out.println("\t Invalid input format!\n");
        continue;
        }else{
       
        amount=Double.parseDouble(amountCollected);
        
        
      
        
        accountBalance+=amount;
        
        transactions= new LinkedHashMap<>();
        transactions.put("Date", date);
        transactions.put("Time", time);
        transactions.put("Type", "Deposit");
        transactions.put("Amount",amount);
        transactions.put("Balance", accountBalance);
        
        transactionHistory.add(transactions);
        }
        
        System.out.printf("""
        
                        
                                            \t\t--- Deposit Successful! ---
                                                    
                                            %-15s %-15s %-15s %s
                                            %-15s %-15s $%,-14.2f $%,.2f
                                            

                          """,
                                "Date", "Time", "Amount", "Balance",
                                date, time, amount, accountBalance
);

        
    while(true){ 
        System.out.print("like to make more deposit? (yes/no): ");
        String more =input.nextLine();
        
        if (more.equalsIgnoreCase("yes")){
            break;
        }else if(more.equalsIgnoreCase("no")){
             System.out.printf("%nThank you!%n");
             return accountBalance;
        }else{
             System.out.printf("%nInvalid input%n");
           
        
        }    
               
    }
  
    
    }
    }
    
    public static double withdrawal (double accountBalance){
    double amount=0;
    String formatExpression="^(?!0+(\\.0+)?$)\\d+(\\.\\d{1,2})?$";
    String date= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
    String time= LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm a"));
    
    
    while (true){

        
        System.out.print("Kindly enter amount to withdraw:$");
        String amountCollected= input.nextLine().trim();
    
        if(!amountCollected.matches(formatExpression)){
            System.out.println("\t\nInvalid input\n");
            continue;
       }
        amount=Double.parseDouble(amountCollected);        
      
       if (amount>accountBalance){
            System.out.println("\t Insufficient funds! \n");
            continue;
        }
        
        accountBalance-=amount;
        break;
       }
        
       
        transactions= new LinkedHashMap<>();
        transactions.put("Date", date);
        transactions.put("Time", time);
        transactions.put("Type", "witdraw");
        transactions.put("Amount",amount);
        transactions.put("Balance", accountBalance);
        
        transactionHistory.add(transactions);
        
        
        System.out.printf("""
        
                        
                                            \t\t--- Withdrawal Successful! ---
                                                    
                                            %-15s %-15s %-15s %-15s
                                            %-15s %-15s $%,-15.2f $%,-12.2f
                                            

                          """,
                                "Date", "Time", "Amount", "Balance",
                                date, time, amount, accountBalance
);

    while (true){    
    System.out.print("Will you like to make more withdraw? (yes/no)");
    String more =input.nextLine();
    
    if (more.equalsIgnoreCase("yes")){
        break;
    }else if(more.equalsIgnoreCase("no")){
         System.out.printf("%nThank you!%n");
         break;
    }else{
         System.out.printf("%nInvalid input%n");
           
        
        }    
               
      }
       return accountBalance;
    }
    
    
    public static void displayTransactionHistory (List<Map<String, Object>> transactionHistory){
    
    if (transactionHistory.isEmpty()){
        System.out.print("\n\tNo Transactions yet!\n");
        return;
    }
    
    System.out.println("-----------------------------------------------------------------------------");
System.out.printf(
    " %-15s %-15s %-15s %-15s %s%n", 
    "Date", "Time", "Type", "Amount", "Balance");
    
    
    System.out.println("-----------------------------------------------------------------------------");
    
    for (Map<String, Object> transactions: transactionHistory){
    
    System.out.printf("""
                    %-15s %-15s %-15s $%,-15.2f $%,.2f%n%n
                    """, 
                    transactions.get("Date"),
                    transactions.get("Time"),
                    transactions.get("Type"),
                    (double)transactions.get("Amount"),
                    (double)transactions.get("Balance")
            
             );
    
    }
    
    
  }
    
}
    
    
    


