import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("""
                    === MAIN PHONE MENU ===
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Call divert
                    7. Settings
                    8. Info service
                    9. Voice mailbox number
                    10. Service command editor
                    11. Connectivity
                    12. Profiles
                    13. SIM Services
                    0. Exit
                    """);

            System.out.print("Choose main menu (0-13): ");
            int mainChoice = readInt(sc);

            switch (mainChoice) {
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;

                case 1: // Phone book
                    System.out.println("""
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
                            0. Back to main menu
                            """);
                    System.out.print("Choose Phone book option: ");
                    int pb = readInt(sc);
                    switch (pb) {
                        case 1 -> System.out.println("Phone book: Searching...");
                        case 2 -> System.out.println("Phone book: Service numbers (SIM-dependant)...");
                        case 3 -> {
                            System.out.print("Enter name to add: ");
                            sc.nextLine(); // consume newline
                            String name = sc.nextLine();
                            System.out.println("Added '" + name + "' to phone book (demo).");
                        }
                        case 4 -> System.out.println("Erasing entry...");
                        case 5 -> System.out.println("Editing entry...");
                        case 6 -> System.out.println("Assigning tone...");
                        case 7 -> System.out.println("Sending b'card...");
                        case 8 -> System.out.println("Options submenu (type of view, memory status)...");
                        case 9 -> System.out.println("Setting speed dials...");
                        case 10 -> System.out.println("Voice tags management...");
                        case 0 -> System.out.println("Returning to main menu...");
                        default -> System.out.println("Invalid Phone book option.");
                    }
                    break;

                case 2: // Messages
                    System.out.println("""
                            --- Messages ---
                            1. Write messages
                            2. Inbox
                            3. Outbox
                            4. Picture messages
                            5. Templates
                            6. Smileys
                            7. Message settings
                            0. Back to main menu
                            """);
                    System.out.print("Choose Messages option: ");
                    int msg = readInt(sc);
                    switch (msg) {
                        case 1 -> {
                            System.out.print("Compose message: ");
                            sc.nextLine(); // consume newline
                            String text = sc.nextLine();
                            System.out.println("Message saved/drafted: " + text);
                        }
                        case 2 -> System.out.println("Showing Inbox (demo)...");
                        case 3 -> System.out.println("Showing Outbox (demo)...");
                        case 4 -> System.out.println("Picture messages...");
                        case 5 -> System.out.println("Templates...");
                        case 6 -> System.out.println("Smileys list...");
                        case 7 -> System.out.println("Message settings (centre number, validity...)");
                        case 0 -> System.out.println("Returning to main menu...");
                        default -> System.out.println("Invalid Messages option.");
                    }
                    break;

                case 3: // Chat (simple placeholder)
                    System.out.println("""
                            --- Chat ---
                            1. Open chat
                            2. New chat
                            0. Back to main menu
                            """);
                    System.out.print("Choose Chat option: ");
                    int chat = readInt(sc);
                    switch (chat) {
                        case 1 -> System.out.println("Opening chat...");
                        case 2 -> System.out.println("Starting new chat...");
                        case 0 -> System.out.println("Returning to main menu...");
                        default -> System.out.println("Invalid Chat option.");
                    }
                    break;

                case 4: // Call register
                    System.out.println("""
                            --- Call register ---
                            1. Missed calls
                            2. Received calls
                            3. Dialled numbers
                            4. Erase recent call lists
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit
                            0. Back to main menu
                            """);
                    System.out.print("Choose Call register option: ");
                    int cr = readInt(sc);
                    switch (cr) {
                        case 1 -> System.out.println("Listing missed calls...");
                        case 2 -> System.out.println("Listing received calls...");
                        case 3 -> System.out.println("Listing dialled numbers...");
                        case 4 -> System.out.println("Erasing recent call lists...");
                        case 5 -> {
                            System.out.println("""
                                    Call duration:
                                    1. Last call duration
                                    2. All calls' duration
                                    0. Back
                                    """);
                            System.out.print("Choose duration option: ");
                            int dur = readInt(sc);
                            switch (dur) {
                                case 1 -> System.out.println("Last call duration: 00:02:34 (demo)");
                                case 2 -> System.out.println("All calls duration: 00:45:10 (demo)");
                                case 0 -> System.out.println("Back to Call register main");
                                default -> System.out.println("Invalid duration option.");
                            }
                        }
                        case 6 -> System.out.println("Showing call costs (demo)...");
                        case 7 -> System.out.println("Call cost settings...");
                        case 8 -> System.out.println("Prepaid credit: 0.00 (demo)");
                        case 0 -> System.out.println("Returning to main menu...");
                        default -> System.out.println("Invalid Call register option.");
                    }
                    break;

                case 5:
                    System.out.println("""
                            --- Tones ---
                            (submenus: Ringing tone, Ringing volume, etc.)
                            0. Back to main menu
                            """);
                    readInt(sc); // demo consume
                    break;

                case 6:
                    System.out.println("""
                            --- Call divert ---
                            (submenus: Voice call, Data call, Fax, etc.)
                            0. Back to main menu
                            """);
                    readInt(sc); // demo consume
                    break;

                case 7:
                    System.out.println("""
                            --- Settings ---
                            (submenus: Profile settings, Connectivity, Security, Restore factory settings, etc.)
                            0. Back to main menu
                            """);
                    readInt(sc); // demo consume
                    break;

                case 8:
                    System.out.println("Info service (SIM/network provided info).");
                    break;

                case 9:
                    System.out.println("Voice mailbox number (SIM dependent).");
                    break;

                case 10:
                    System.out.println("Service command editor (enter MMI/commands).");
                    break;

                case 11:
                    System.out.println("Connectivity (Bluetooth, USB, etc.).");
                    break;

                case 12:
                    System.out.println("Profiles (General, Silent, Meeting, Outdoor, etc.).");
                    break;

                case 13: // SIM Services last
                    System.out.println("""
                            --- SIM Services ---
                            These are services provided by your SIM / network operator.
                            Options will vary depending on SIM support.
                            0. Back to main menu
                            """);
                    readInt(sc); // demo consume
                    break;

                default:
                    System.out.println("Invalid main menu selection. Please choose 0-13.");
            }

            System.out.println(); // blank line before redisplaying
        }

        sc.close();
    }

    // Utility: read integer safely
    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
