import java.util.Scanner;

class Nokia3310Backward {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        while (true) {    // MAIN MENU LOOP

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
                    11. Clock
                    12. Profiles
                    13. SIM Services

                    0. Power off
                    """;

            System.out.print(menu);

            System.out.print("\nSelect option: ");
            int mainMenuChoice = inputCollector.nextInt();

            if (mainMenuChoice == 0) {
                System.out.println("\n Nokia 3310...");
                break;   // EXIT MAIN MENU LOOP
            }

            switch (mainMenuChoice) {

                case 1 -> {   // PHONEBOOK
                    while (true) {   // SUBMENU LOOP

                        String phoneBookMenu = """
                                --- Phone Book ---
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

                        System.out.print(phoneBookMenu);
                        int phoneChoice = inputCollector.nextInt();

                        if (phoneChoice == 0) break;   // GO BACK TO MAIN MENU

                        switch (phoneChoice) {
                            case 1 -> System.out.println("Search selected");
                            case 2 -> System.out.println("Service Nos selected");
                            case 3 -> System.out.println("Add name selected");

                            case 8 -> {   // Options submenu
                                while (true) {

                                    String opt = """
                                            --- Options ---
                                            1. Type of view
                                            2. Memory status
                                            0. Back
                                            """;

                                    System.out.print(opt);
                                    int optChoice = inputCollector.nextInt();

                                    if (optChoice == 0) break;

                                    switch (optChoice) {
                                        case 1 -> System.out.println("Type of view selected");
                                        case 2 -> System.out.println("Memory status selected");
                                        default -> System.out.println("Invalid Input!");
                                    }
                                }
                            }

                            default -> System.out.println("Invalid input!");
                        }
                    }
                }

                case 2 -> {
                    while (true) {   // MESSAGES SUBMENU LOOP

                        String msgMenu = """
                                --- Messages ---
                                1. Write message
                                2. Inbox
                                3. Outbox
                                4. Picture messages
                                5. Templates
                                6. Smileys
                                7. Message settings

                                0. Back
                                """;

                        System.out.print(msgMenu);
                        int msgChoice = inputCollector.nextInt();

                        if (msgChoice == 0) break;

                        switch (msgChoice) {
                            case 1 -> System.out.println("Write message");
                            case 2 -> System.out.println("Inbox opened");
                            case 3 -> System.out.println("Outbox opened");

                            case 7 -> {
                                while (true) {   // MESSAGE SETTINGS LOOP

                                    String msgSet = """
                                            --- Message Settings ---
                                            1. Set 1
                                            2. Set 2
                                            0. Back
                                            """;

                                    System.out.print(msgSet);
                                    int msgSetChoice = inputCollector.nextInt();

                                    if (msgSetChoice == 0) break;

                                    switch (msgSetChoice) {
                                        case 1 -> System.out.println("Set 1 selected");
                                        case 2 -> System.out.println("Set 2 selected");
                                        default -> System.out.println("Invalid input!");
                                    }
                                }
                            }
                        }
                    }
                }

                default -> System.out.println("Invalid main menu selection!");
            }
        }

        System.out.println("\nThank you for using Nokia 3310!");
    }
}

