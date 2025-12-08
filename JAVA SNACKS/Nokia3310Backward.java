import java.util.Scanner;

class Nokia3310Backward {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        while (true) {
            String menu = 
            """

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
                    11. Clock
                    12. Profiles
                    13. SIM Services

                    0. Power off

           """;

            System.out.print(menu);
            int mainMenuChoice = inputCollector.nextInt();

            if (mainMenuChoice == 0) {
                System.out.println("\nShutting down Nokia 3310...");
                break;
            }

            switch (mainMenuChoice) {

                
                case 1 -> {
                    while (true) {
                        String phonebookMenu = 
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

                                0. Back
                         """;

                        System.out.print(phonebookMenu);
                        int phonebookMenuChoice = inputCollector.nextInt();
                        if (phonebookMenuChoice == 0) break;

                        switch (phonebookMenuChoice) {
                            case 1 -> System.out.println("Search has been selected\n");
                            case 2 -> System.out.println("Service nos selected\n");
                            case 3 -> System.out.println("Add name selected\n");
                            case 4 -> System.out.println("Erase selected\n");
                            case 5 -> System.out.println("Edit selected\n");
                            case 6 -> System.out.println("Assign tone selected\n");
                            case 7 -> System.out.println("Sending b'card...\n");

                            case 8 -> {
                                while (true) {
                                    String optionsMenu = 
                                    """
                                            --- Options ---

                                            1. Type of view
                                            2. Memory status
                                            0. Back
                                            
                                            
                                    """;
                                    System.out.print(optionsMenu);
                                    int optionMenuChoice = inputCollector.nextInt();

                                    if (optionMenuChoice == 0) break;

                                    switch (optionMenuChoice) {
                                        case 1 -> System.out.println("Type of view\n");
                                        case 2 -> System.out.println("Memory status\n");
                                        default -> System.out.println("Invalid input\n");
                                    }
                                }
                            }

                            case 9 -> System.out.println("Speed dials selected\n");
                            case 10 -> System.out.println("Voice tags selected\n");
                            default -> System.out.println("Invalid input\n");
                        }
                    }
                }

               
                case 2 -> {
                    while (true) {
                        String messages = 
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

                                0. Back
                         """;
                        System.out.print(messages);

                        int messagesMenuChoice = inputCollector.nextInt();
                        if (messagesMenuChoice == 0) break;

                        switch (messagesMenuChoice) {
                            case 1 -> System.out.println("Write message selected\n");
                            case 2 -> System.out.println("Inbox selected\n");
                            case 3 -> System.out.println("Outbox selected\n");
                            case 4 -> System.out.println("Picture messages selected\n");
                            case 5 -> System.out.println("Templates selected\n");
                            case 6 -> System.out.println("Smileys selected\n");

                            case 7 -> {
                                while (true) {
                                    String msgSettings = 
                                    """
                                            --- Message Settings ---

                                            1. Set 1
                                            2. Set 2

                                            0. Back
                                           
                                     """;
                                    System.out.print(msgSettings);

                                    int settingChoice = inputCollector.nextInt();
                                    if (settingChoice == 0) break;

                                    switch (settingChoice) {

                                        // SET 1
                                        case 1 -> {
                                            while (true) {
                                                String set1 = 
                                                """
                                                        --- Set 1 ---

                                                        1. Message center number
                                                        2. Message sent as
                                                        3. Message validity

                                                        0. Back
                                                """;

                                                System.out.print(set1);
                                                int set1Option = inputCollector.nextInt();

                                                if (set1Option == 0) break;

                                                switch (set1Option) {
                                                    case 1 -> System.out.println("Message center number\n");
                                                    case 2 -> System.out.println("Message sent as\n");
                                                    case 3 -> System.out.println("Message validity\n");
                                                    default -> System.out.println("Invalid\n");
                                                }
                                            }
                                        }

                                        // SET 2
                                        case 2 -> {
                                            while (true) {
                                                String common3 = 
                                                """
                                                        --- Common 3 ---

                                                        1. Delivery reports
                                                        2. Reply via same center
                                                        3. Character support

                                                        0. Back
                                                        
                                                """;
                                                System.out.print(common3);

                                                int common3MenuChoice = inputCollector.nextInt();
                                                if (common3MenuChoice == 0) break;

                                                switch (common3MenuChoice) {
                                                    case 1 -> System.out.println("Delivery reports\n");
                                                    case 2 -> System.out.println("Reply via same center\n");
                                                    case 3 -> System.out.println("Character support\n");
                                                    default -> System.out.println("Invalid\n");
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            case 8 -> System.out.println("Info service\n");
                            case 9 -> System.out.println("Voice mailbox number\n");
                            case 10 -> System.out.println("Service command editor\n");
                            default -> System.out.println("Invalid input\n");
                        }
                    }
                }

                
                case 3 -> System.out.println("Chat has been selected\n");

              
                case 4 -> {
                    while (true) {
                        String callRegister = 
                        
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

                                0. Back
                                
                        """;
                        System.out.print(callRegister);

                        int callRegisterMenuChoice = inputCollector.nextInt();
                        if (callRegisterMenuChoice == 0) break;

                        switch (callRegisterMenuChoice) {
                            case 1 -> System.out.println("Missed calls selected\n");
                            case 2 -> System.out.println("Received calls selected\n");
                            case 3 -> System.out.println("Dialled numbers selected\n");
                            case 4 -> System.out.println("Erase recent call lists\n");

                            case 5 -> {
                                while (true) {
                                    String callDuration = 
                                    """
                                            --- Call Duration---

                                            1. Last call duration
                                            2. All call's duration
                                            3. Received call's duration
                                            4. Dialled call's duration
                                            5. Clear timers

                                            0. Back
                                          
                                    """;

                                    System.out.print(callDuration);
                                    int callDurationMenuChoice = inputCollector.nextInt();
                                    if (callDurationMenuChoice == 0) break;

                                    switch (callDurationMenuChoice) {
                                        case 1 -> System.out.println("Last call duration displayed\n");
                                        case 2 -> System.out.println("All calls duration displayed\n");
                                        case 3 -> System.out.println("Received calls duration displayed\n");
                                        case 4 -> System.out.println("Dialled calls duration displayed\n");
                                        case 5 -> System.out.println("Timers cleared\n");
                                        default -> System.out.println("Invalid\n");
                                    }
                                }
                            }

                            case 6 -> {
                                while (true) {
                                    String callCosts =
                                    
                                    """
                                            --- Call Costs---

                                            1. Last call cost
                                            2. All call costs
                                            3. Clear counters

                                            0. Back
                                            
                                    """;

                                    System.out.print(callCosts);
                                    int callCostsMenuChoice = inputCollector.nextInt();
                                    if (callCostsMenuChoice == 0) break;

                                    switch (callCostsMenuChoice) {
                                        case 1 -> System.out.println("Last call cost shown\n");
                                        case 2 -> System.out.println("All call costs shown\n");
                                        case 3 -> System.out.println("Counters cleared\n");
                                        default -> System.out.println("Invalid\n");
                                    }
                                }
                            }

                            case 7 -> {
                                while (true) {
                                    String callCostSetting = 
                                    
                                    """
                                            --- Call Cost Settings---

                                            1. Call cost limit
                                            2. Show costs in

                                            0. Back
                                            
                                            
                                    """;

                                    System.out.print(callCostSetting);
                                    int callCostSettingMenuChoice = inputCollector.nextInt();
                                    if (callCostSettingMenuChoice == 0) break;

                                    switch (callCostSettingMenuChoice) {
                                        case 1 -> System.out.println("Call cost limit shown\n");
                                        case 2 -> System.out.println("Costs display format shown\n");
                                        default -> System.out.println("Invalid\n");
                                    }
                                }
                            }

                            case 8 -> System.out.println("Prepaid credit\n");
                            default -> System.out.println("Invalid\n");
                        }
                    }
                }

                // ===========================================
                // 5. TONES
                // ===========================================
                case 5 -> {
                    while (true) {
                        String tones = 
                        
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

                                0. Back
                        """;

                        System.out.print(tones);
                        int tonesMenuChoice = inputCollector.nextInt();
                        if (tonesMenuChoice == 0) break;

                        switch (tonesMenuChoice) {
                            case 1 -> System.out.println("Ringing tone\n");
                            case 2 -> System.out.println("Ringing volume\n");
                            case 3 -> System.out.println("Incoming call alert\n");
                            case 4 -> System.out.println("Composer\n");
                            case 5 -> System.out.println("Message alert tone\n");
                            case 6 -> System.out.println("Keypad tones\n");
                            case 7 -> System.out.println("Warning and game tones\n");
                            case 8 -> System.out.println("Vibrating alert\n");
                            case 9 -> System.out.println("Screen saver\n");
                            default -> System.out.println("Invalid\n");
                        }
                    }
                }

              
                case 6 -> {
                    while (true) {
                        String settings = 
                        
                        """
                                --- Settings---

                                1. Call setting
                                2. Phone settings
                                3. Security settings
                                4. Restore factory settings

                                0. Back
                                
                        """;
                        System.out.print(settings);

                        int settingsMenuChoice = inputCollector.nextInt();
                        if (settingsMenuChoice == 0) break;

                        switch (settingsMenuChoice) {

                            // CALL SETTINGS
                            case 1 -> {
                                while (true) {
                                    String callSettings = 
                                    
                                    """
                                            --- Call Settings---

                                            1. Automatic redial
                                            2. Speed dialing
                                            3. Call waiting
                                            4. Own number sending
                                            5. Phone line in use
                                            6. Automatic answer

                                            0. Back
                                            
                                    """;

                                    System.out.print(callSettings);

                                    int callSettingsMenuChoice = inputCollector.nextInt();
                                    if (callSettingsMenuChoice == 0) break;

                                    switch (callSettingsMenuChoice) {
                                        case 1 -> System.out.println("Automatic redial\n");
                                        case 2 -> System.out.println("Speed dialing\n");
                                        case 3 -> System.out.println("Call waiting\n");
                                        case 4 -> System.out.println("Own number sending\n");
                                        case 5 -> System.out.println("Phone line in use\n");
                                        case 6 -> System.out.println("Automatic answer\n");
                                        default -> System.out.println("Invalid\n");
                                    }
                                }
                            }

                            // PHONE SETTINGS
                            case 2 -> {
                                while (true) {
                                    String phoneSettings = 
                                    
                                    """
                                            --- Phone Settings---

                                            1. Language
                                            2. Cell info display
                                            3. Welcome note
                                            4. Network selection
                                            5. Lights 2
                                            6. Confirm SIM service actions

                                            0. Back
                                            
                                   """;

                                    System.out.print(phoneSettings);

                                    int phoneSettingsMenuChoice = inputCollector.nextInt();
                                    if (phoneSettingsMenuChoice == 0) break;

                                    switch (phoneSettingsMenuChoice) {
                                        case 1 -> System.out.println("Language\n");
                                        case 2 -> System.out.println("Cell info display\n");
                                        case 3 -> System.out.println("Welcome note\n");
                                        case 4 -> System.out.println("Network selection\n");
                                        case 5 -> System.out.println("Lights 2\n");
                                        case 6 -> System.out.println("Confirm SIM service actions\n");
                                        default -> System.out.println("Invalid\n");
                                    }
                                }
                            }

                            // SECURITY
                            case 3 -> {
                                while (true) {
                                    String securitySettings = 
                                    
                                    """
                                            --- Security Settings---

                                            1. PIN code request
                                            2. Call barring service
                                            3. Fixed dialing
                                            4. Closed user group
                                            5. Phone security
                                            6. Change access codes

                                            0. Back
                                            
                                            
                                   """;

                                    System.out.print(securitySettings);

                                    int securitySettingsMenuChoice = inputCollector.nextInt();
                                    if (securitySettingsMenuChoice == 0) break;

                                    switch (securitySettingsMenuChoice) {
                                        case 1 -> System.out.println("PIN code request\n");
                                        case 2 -> System.out.println("Call barring service\n");
                                        case 3 -> System.out.println("Fixed dialing\n");
                                        case 4 -> System.out.println("Closed user group\n");
                                        case 5 -> System.out.println("Phone security\n");
                                        case 6 -> System.out.println("Change access codes\n");
                                        default -> System.out.println("Invalid\n");
                                    }
                                }
                            }

                        
                            case 4 -> System.out.println("Factory settings restored\n");

                            default -> System.out.println("Invalid\n");
                        }
                    }
                }

              
                case 7 -> System.out.println("Call divert selected\n");
                case 8 -> System.out.println("Games selected\n");
                case 9 -> System.out.println("Calculator selected\n");
                case 10 -> System.out.println("Reminders selected\n");

                case 11 -> {
                    while (true) {
                        String clock = 
                        
                        """
                                --- Clock ---

                                1. Alarm clock
                                2. Clock settings
                                3. Date settings
                                4. Stopwatch
                                5. Countdown timer
                                6. Auto update of date/time

                                0. Back
                        """;
                        System.out.print(clock);

                        int clockMenuChoice = inputCollector.nextInt();
                        if (clockMenuChoice == 0) break;

                        switch (clockMenuChoice) {
                            case 1 -> System.out.println("Alarm clock\n");
                            case 2 -> System.out.println("Clock settings\n");
                            case 3 -> System.out.println("Date settings\n");
                            case 4 -> System.out.println("Stopwatch\n");
                            case 5 -> System.out.println("Countdown timer\n");
                            case 6 -> System.out.println("Auto update enabled\n");
                            default -> System.out.println("Invalid\n");
                        }
                    }
                }

                case 12 -> System.out.println("Profiles selected\n");
                case 13 -> System.out.println("SIM services selected\n");

                default -> System.out.println("Invalid main menu input\n");
            }
        }
    }
}

