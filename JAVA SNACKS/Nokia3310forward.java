import java.util.Scanner;

class Nokia3310forward{

	static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);


		String menu = """	
	        
                    NOKIA 3310

	        === MAIN PHONE MENU ===
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Info service
                    9. Voice mailbox number
                    10. Service command editor
                    11. Connectivity
                    12. Profiles
                    13. SIM Services

	                """;

	        System.out.print(menu);

	        int mainMenuChoice =  inputCollector.nextInt();
            //Submenu for phonebook
	        switch(mainMenuChoice){
	
		        case  1 -> {System.out.println("Phonebook Menu"); 

		        String PhonebookMenu = // Phone book
                            """
                                        --- Phone book ---
                                        
                                        1. Search
                                        2. Service Nos.
                                        3. Add name
                                        4. Erase
                                        5. Edit
                                        6. Assign tone
                                        7. Send b'card
                                        8. Options
                                        9. Speed dials
                                        10. Voice tags
                            
                            """;
                            System.out.print(PhonebookMenu);

	                    int phonebookMenuChoice =  inputCollector.nextInt();
	                        switch(phonebookMenuChoice){
		                        case 1 -> System.out.print("Search has been selected\n\n");
                                case 2 -> System.out.print("Service no has been selected\n\n");
                                case 3 -> System.out.print("Add Name has been selected\n");
                                case 4 -> System.out.print("Erase has been selected\n\n");
                                case 5 -> System.out.print("Edit has been seleted\n\n");
                                case 6 -> System.out.print("Assign tone\n\n");
                                case 7 -> System.out.print("Sending b'card\n\n");
                                case 8 -> {System.out.print("Options");
                                        
                                        String optionsMenu= // Options sub sub Menu
                                                """

                                                --- Options ---
                                                
                                                1. Type of view
                                                2. Service Nos.
                                                
                                                """;
                                                
                                                System.out.print(optionsMenu);

	                                    int optionMenuChoice =  inputCollector.nextInt();
	                                        switch(optionMenuChoice){
		                                        case 1 -> System.out.print("Type");
                                                case 2 -> System.out.print("Memory status");
                                                }
                                                
                                                }
                                                     
                                case 9 -> System.out.print("Speed dials Displayed");
                                case 10-> System.out.print("Voice tags selected");
                                default -> System.out.println("Oga, you no go school\n");
                                }
                                
                                }
		
	            case 2 -> {System.out.print("Messages");
	                            
	                                  
                                        String Messages= // Messages sub Menu
                                                """

                                                            --- Messages ---
                                                            
                                                            1. Write Messages
                                                            2. Inbox
                                                            3. Outbox
                                                            4. Picture messages
                                                            5. Templates
                                                            6. Smileys
                                                            7. Message settings
                                                            8. Info Service 
                                                            9. Voice mailbox number
                                                            10. Service command editor
                                                            
                                                """;
                                                System.out.print(Messages);
                                          

	                                    int messagesMenuChoice =  inputCollector.nextInt();
	                                        switch(messagesMenuChoice){
		                                        
                                                case 1 -> System.out.print("Write messages seleceted \n");
                                                case 2 -> System.out.print("Inbox selected \n");
                                                case 3 -> System.out.print("Outbox selected \n");
                                                case 4 -> System.out.print("Picture messages selected \n ");
                                                case 5 -> System.out.print("Templates selected");
                                                case 6 -> System.out.print("Smileys selected");
                                                case 7 -> {System.out.print("Message settings ");
                                                
                                                                    System.out.print("Messages Settings");
	                                                
	                                                      
                                                            String messageSetting= // Messages Settings sub sub sub Menu
                                                                    """

                                                                                --- Messages Settings ---
                                                                                
                                                                                1. Set 1
                                                                                2. Set 2
                                                                                
                                                                                
                                                                    """;
                                                                    System.out.print(messageSetting);
                                                              

	                                                        int messageSettingMenuChoice =  inputCollector.nextInt();
	                                                            switch(messageSettingMenuChoice){
		                                                            
                                                                    case 1 -> {System.out.print("Set 1");
                                                                    
                                                                           
                                                                                 String set1= // set 1 sub sub sub sub Menu
                                                                    """

                                                                                ---Set 1 ---
                                                                                
                                                                                1. Message center number
                                                                                2. Message sent as 
                                                                                3. Message validity
                                                                                
                                                                                
                                                                    """;
                                                                                System.out.print(set1);
                                                                          

	                                                                    int set1MenuChoice =  inputCollector.nextInt();
	                                                                        switch(set1MenuChoice){
	                                                                            case 1 -> System.out.print("Message centre number displayed");
		                                                                        case 2 -> System.out.print("Message sent as");
                                                                                case 3 -> System.out.print("Message validity displayed");
                                                                                default -> System.out.println("Oga, you no go school\n");
                                                                                }
                                                                                }
                                                                    
                                                                    case 2 -> {System.out.print("Set 2");
                                                                    
                                                                                String Common3= // common 3 sub sub sub sub Menu
                                                                    """

                                                                                --- Common3 ---
                                                                                
                                                                                1. Delivery reports
                                                                                2. Reply via same centre 
                                                                                3. Character support
                                                                                
                                                                                
                                                                    """;
                                                                                System.out.print(Common3);
                                                                          

	                                                                    int common3MenuChoice =  inputCollector.nextInt();
	                                                                        switch(common3MenuChoice){
	                                                                            case 1 -> System.out.print("Delivery reports displayed\n");
		                                                                        case 2 -> System.out.print("Reply via same centre ");
                                                                                case 3 -> System.out.print("Character support displayed\n");
                                                                                default -> System.out.println("Oga, you no go school\n");
                                                                   
                                                                                }
                                                                                }
                                                                                }
                                                                                }
                                                                                	            
                                                            
                                                
                                                
                                                case 8 -> System.out.print("Info service \n");
                                                case 9 -> System.out.print("Voice mailbox number\n");
                                                case 10 -> System.out.print("Service command editor\n");
                                                default -> System.out.println("Oga, you no go school\n");
                                                }
                                                }	    
                                                
	            
		        case 3 -> System.out.print("Chat has been selected");
		        case 4 -> {System.out.print("Call Register");
	                            
	                                  
                                                String callRegister= // CallRegister
                                                """

                                                            --- Call Register---
                                                            
                                                            1. Missed calls
                                                            2. Received calls
                                                            3. Dialled numbers
                                                            4. Erase recent call lists
                                                            5. Show call duration
                                                            6. Show call costs
                                                            7. Call costs settings
                                                            8. Prepaid credit 
                                                           
                                                            
                                                """;
                                                System.out.print(callRegister);
                                          

	                                    int callRegisterMenuChoice =  inputCollector.nextInt();
	                                        switch(callRegisterMenuChoice){
		                                        case 1 -> System.out.print("Missed calls seleceted \n");
                                                case 2 -> System.out.print("Received calls selected \n");
                                                case 3 -> System.out.print("Dialled numbers selected \n");
                                                case 4 -> System.out.print("Erase recent call: Erased \n ");
                                                case 5 -> {System.out.print("Show call duration\n");
                                                
                                                                 String callDuration= // CallDuration
                                                            """
                                                                        --- Call Duration---
                                                                        
                                                                        1. Last call duration
                                                                        2. All call's duration
                                                                        3. Received call's duration
                                                                        4. Dialled call's duration
                                                                        5. clear timers
                                                                       
                                                                       
                                                                        
                                                            """;
                                                            
                                                            System.out.print(callDuration);
                                                      

	                                                int callDurationMenuChoice =  inputCollector.nextInt();
	                                                    switch(callDurationMenuChoice){
		                                                    case 1 -> System.out.print("Last call duration displayed\n");
                                                            case 2 -> System.out.print("All call's duration displayed \n");
                                                            case 3 -> System.out.print("Received call's duration displayed \n");
                                                            case 4 -> System.out.print("Dialled call's duration diplayed\n ");
                                                            case 5 -> System.out.print("clear timers: timers cleared\n");
                                                            default -> System.out.println("Oga, you no go school\n");                                                     
                                                                                                                    
                                                            }
                                                            }	 
                                                                       
                                                            
                                                case 6 -> {System.out.print("Show call costs");
                                                
                                                
                                                         String callCosts= // callCosts
                                                            """
                                                                        --- call Costs---
                                                                        
                                                                        1. Last call duration
                                                                        2. All call's duration
                                                                        3. Received call's duration
                                                                        
                                                                       
                                                                       
                                                                        
                                                            """;
                                                            System.out.print(callCosts);
                                                      

	                                                int callCostsMenuChoice =  inputCollector.nextInt();
	                                                    switch(callCostsMenuChoice){
		                                                    case 1 -> System.out.print("Last call cost displayed\n");
                                                            case 2 -> System.out.print("All call's cost displayed \n");
                                                            case 3 -> System.out.print("Clear counters: counters cleared\n");
                                                            default -> System.out.println("Oga, you no go school\n");
                                                                                                                
                                                                                                                    
                                                            }
                                                            }	 
                                                                       
                                                case 7 -> {System.out.print("Call costs settings ");
                                                    
                                                        
                                                         String callCostSetting= // call Costs settings
                                                            """
                                                                        --- call Cost Settings---
                                                                        
                                                                        1. Last call duration
                                                                        2. All call's duration
                                                                        3. Received call's duration
                                                                        
                                                                       
                                                                       
                                                                        
                                                            """;
                                                            System.out.print(callCostSetting);
                                                      

	                                                int callCostSettingMenuChoice =  inputCollector.nextInt();
	                                                    switch(callCostSettingMenuChoice){
		                                                    case 1 -> System.out.print("Call cost limit displayed\n");
                                                            case 2 -> System.out.print("Show costs in: costs displayed\n");
                                                            default -> System.out.println("Oga, you no go school\n");                                                                                                                                                                 
                                                                                                                    
                                                            }
                                                            }	
                                                            
                                                            
                                                case 8 -> System.out.print("Prepaid credit \n");
                                                default -> System.out.println("Oga, you no go school\n");
                                                
                                                
                                                }
                                                }	            
                                                
                                                
                                                
                                                
                case 5 -> {System.out.print("Tones\n");
                
                      String tones= // tones sub menu
                                                           """
                                                                        --- Tones---
                                                                        
                                                                        1. Ringing tone
                                                                        2. Ringing volume
                                                                        3. Incoming call alert
                                                                        4. Composer
                                                                        5. Message alert tone
                                                                        6. Keypad tones
                                                                        7. Warning and game tones
                                                                        8. Vibrating alert
                                                                        9. Screen saver
                                                                       
                                                                       
                                                                        
                                                            """;
                                                            System.out.print(tones);
                                                      

	                                                int tonesMenuChoice =  inputCollector.nextInt();
	                                                    switch(tonesMenuChoice){
		                                                    case 1 -> System.out.print("Ringing tone seleceted\n");
                                                            case 2 -> System.out.print("Ringing volume displayed \n");
                                                            case 3 -> System.out.print("Incoming call alert\n");
                                                            case 4 -> System.out.print("Composer diplayed\n");
                                                            case 5 -> System.out.print("Message alert tone has been selected \n");
                                                            case 6 -> System.out.print("Keypad tones has been selected\n");
                                                            case 7 -> System.out.print("Warning and game tones has been selected\n");
                                                            case 8 -> System.out.print("Vibrating alert tones\n");
                                                            case 9 -> System.out.print("Screen saver has been selected\n");
                                                            default -> System.out.println("Oga, you no go school\n");
                                                                                                                
                                                                                                                    
                                                            }
                                                            }	 
                        
                case 6 -> {System.out.print("Settings \n");
                        
                                                          String settings= // settings sub menu
                                                           """
                                                                        --- Settings---
                                                                        
                                                                        1. Call setting
                                                                        2. Phone settings
                                                                        3. Security settings
                                                                        4. Restore factory settings
                                                                                                                                                                                                                   
                                                                                                                                                                                                                     
                                                            """;
                                                            System.out.print(settings);
                                                      

	                                                int settingsMenuChoice =  inputCollector.nextInt();
	                                                    switch(settingsMenuChoice){
		                                                    case 1 -> {System.out.print("Call settings\n");
		                                                    
		                                                                 String callSettings= // call settings sub sub menu
                                                                           """
                                                                                        --- Call Settings---
                                                                                        
                                                                                        1. Automatic redial
                                                                                        2. Speed dialing
                                                                                        3. Call waiting
                                                                                        4. Own number sending
                                                                                        5. Phone line in use
                                                                                        6. Automatic answer
                                                                                        

                                                                            """;
                                                                            System.out.print(callSettings);
                                                                      

	                                                                int callSettingsMenuChoice =  inputCollector.nextInt();
	                                                                    switch(callSettingsMenuChoice){
		                                                                    case 1 -> System.out.print("Automatic redial seleceted\n");		                                                                    		                                                                        	                                                                    
                                                                            case 2 -> System.out.print("Speed dialing displayed \n");
                                                                            case 3 -> System.out.print("Call waiting\n");
                                                                            case 4 -> System.out.print("Own number sending diplayed\n");
                                                                            case 5 -> System.out.print("Phone line in use diplayed\n");
                                                                            case 6 -> System.out.print("Automatic answer diplayed\n");
                                                                            default -> System.out.println("Oga, you no go school\n");
                                                            
		                                                                    }
		                                                                    }
		                                                                   
                                                            case 2 -> {System.out.print("Phone Settings\n");
                                                            
                                                                     String phoneSettings= // phone settings sub sub menu
                                                                           
                                                                           """
                                                                                        --- Phone Settings---
                                                                                        
                                                                                        1. Language
                                                                                        2. Cell info display
                                                                                        3. Welcome note
                                                                                        4. Network selection
                                                                                        5. Lights 2
                                                                                        6. Confirm SIM service actions
                                                                                        

                                                                            """;
                                                                            System.out.print(phoneSettings);
                                                                      

	                                                                int phoneSettingsMenuChoice =  inputCollector.nextInt();
	                                                                    switch(phoneSettingsMenuChoice){
		                                                                    case 1 -> System.out.print(" Language selece has been selected\n");		                                                                    		                                                                        	                                                                    
                                                                            case 2 -> System.out.print("Cell info displayed \n");
                                                                            case 3 -> System.out.print("Welcome note displayed\n");
                                                                            case 4 -> System.out.print("Network selection diplayed\n");
                                                                            case 5 -> System.out.print("Lights 2 diplayed\n");
                                                                            case 6 -> System.out.print("Confirm SIM service actions: diplayed\n");
                                                                            default -> System.out.println("Oga, you no go school\n");
		                                                                    }
		                                                                    }
                                                            case 3 -> {System.out.print("Security settings\n");
                                                            
                                                                    String securitySettings= // Security settings sub sub menu
                                                                           
                                                                           """
                                                                                        --- security Settings--
                                                                                        
                                                                                        1. PIN code request
                                                                                        2. Call barring service
                                                                                        3. Fixed dialing
                                                                                        4. Closed user group
                                                                                        5. Phone security
                                                                                        6. Change access codes
                                                                                        

                                                                            """;
                                                                            System.out.print(securitySettings);
                                                                      

	                                                                int securitySettingsMenuChoice =  inputCollector.nextInt();
	                                                                    switch(securitySettingsMenuChoice){
		                                                                    case 1 -> System.out.print(" PIN code displayed\n");		                                                                    		                                                                        	                                                                    
                                                                            case 2 -> System.out.print("Call barring service selected \n");
                                                                            case 3 -> System.out.print("Fixed dialing displayed\n");
                                                                            case 4 -> System.out.print("Closed user group diplayed\n");
                                                                            case 5 -> System.out.print("Phone security diplayed\n");
                                                                            case 6 -> System.out.print("Change access codes: access code changed\n");
                                                                            default -> System.out.println("Oga, you no go school\n");
		                                                                    }
		                                                                    }
                                                            case 4 -> System.out.print("Restore factory settings: factory settings restored\n");
                                                            default -> System.out.println("Oga, you no go school\n");
                                                            
                                                            }                                                    
                                                            }                                                       
                                                            
                                                             
                case 7 -> System.out.print("Call divert has been selected");
                case 8 -> System.out.print("Games has been selected");
                case 9 -> System.out.print("Calculator has been selected");
                case 10 -> System.out.print("Reminders has been selected");
                case 11 -> {System.out.print("Clock\n");
                
                         String clock= // clock  sub menu
                                                                           
                         """
                                  --- security Settings--
                                                                   
                                  1. Alarm clock
                                  2. CLock settings
                                  3. Date settings
                                  4. Stopwatch
                                  5. Countdown timer
                                  6. Auto update of date and time
                                                                                       
                                                                                        

                         """;
                          System.out.println(clock);
                          
                           int clockMenuChoice =  inputCollector.nextInt();
	                       
	                         switch(clockMenuChoice){
		                        case 1 -> System.out.print(" Alarm clock displayed\n");
		                        case 2 -> System.out.print("CLock settings selected \n");
		                        case 3 -> System.out.print("Date settings selected\n");
		                        case 4 -> System.out.print("Stopwatch diplayed\n");
		                        case 5 -> System.out.print("Countdown timer diplayed\n");
		                        case 6 -> System.out.print("Auto update of date and time: updated\n");
		                        default -> System.out.println("Oga, you no go school\n");

		                        }
		                        }
                                                            
                case 12 -> System.out.print("Profiles has been selected");
                case 13 -> System.out.print("Sim services has been selected");
                                                
		         default -> System.out.println("Oga, you no go school\n");

	    }
    
    }
	
}		

