import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem{
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

      
        ArrayList<String[]> booksLibrary = new ArrayList<>();

     
        booksLibrary.add(new String[]{"The Hobbit", "47", "Wisdom Craig"});
        booksLibrary.add(new String[]{"The Mystery", "12", "Martin Manser"});

        int option = 0;
        int count = 0;
        String more = "no";

        while (true) {
            String bookMenu = """
                    
                                        --Welcome To The Book Suggestion System--
                                        1. Get Suggestions
                                        2. Add Book
                                        3. Remove Book
                                        4. Update Book
                                        5. Show all books
                                        0. Exit
                    
                                """;

            System.out.print(bookMenu);
            System.out.print("Enter operation: ");
            String bookMenuOption = input.nextLine();

            
            if (!bookMenuOption.matches("[0-5]")) {
                System.out.println("\t Invalid input\n");
                continue;
            }

            option = Integer.parseInt(bookMenuOption);
            if (option == 0) {
                System.out.printf("%nThank you for visiting the library...%n%n");
                break;
            }

            switch (option) {

                case 1 -> { 
                    while (true) {
                        if (count >= booksLibrary.size()) {
                            System.out.printf("%nNo more book to suggest! Will you like to add book? (yes/no): ");
                            String exitToAdd = input.nextLine();

                            if (exitToAdd.equalsIgnoreCase("yes")) {
                                System.out.printf("%nThank you for choosing to contribute, kindly add on main menu!!%n");
                            } else {
                                System.out.printf("Thank you!!! Kindly check back later%n");
                            }
                            break;
                        }

                        String[] book = booksLibrary.get(count);
                        System.out.printf("""
                                
                                Book For The Day:
                                Book Title: %s
                                Pages: %s
                                Author: %s
                                
                                """, book[0], book[1], book[2]);

                        System.out.print("Would you like to get another suggestion? (yes/no): ");
                        more = input.nextLine();

                        if (more.equalsIgnoreCase("no")) {
                            System.out.printf("%nThank you!!! Kindly check back later%n%n");
                            break;
                        } else if (more.equalsIgnoreCase("yes")) {
                            count++;
                        } else {
                            System.out.printf("%n\tInvalid input %n%n");
                        }
                    }
                }

                case 2 -> { 
                    int counter = 0;
                    while (true) {
                        int indexMatch = -1;
                        System.out.print("Kindly enter the Book Title: ");
                        String newBookTitle = input.nextLine();

                       
                        for (int index = 0; index < booksLibrary.size(); index++) {
                            if (booksLibrary.get(index)[0].equalsIgnoreCase(newBookTitle)) {
                                indexMatch = index;
                                break;
                            }
                        }

                        if (indexMatch == -1) {
                            String[] newBook = new String[3];
                            newBook[0] = newBookTitle;

                            System.out.print("Kindly enter the number of Pages: ");
                            newBook[1] = input.nextLine();

                            System.out.print("Kindly enter name of Author: ");
                            newBook[2] = input.nextLine();

                            booksLibrary.add(newBook);
                            System.out.printf("%nBook Added Successfully!%n");
                            counter++;
                        } else {
                            System.out.print("Book already exist in Record\n\n");
                        }

                        System.out.print("\nWould you like to add another book? (yes/no): ");
                        more = input.nextLine();
                        if (more.equalsIgnoreCase("no")) {
                            System.out.printf("%nYou Have Successfully added %d Book(s)%n", counter);
                            System.out.printf("Thank you!!!%n%n");
                            break;
                        }
                    }
                }

                case 3 -> { 
                    while (true) {
                        System.out.print("Kindly enter the Book Title to remove: ");
                        String remBookTitle = input.nextLine();

                        int indexToRemove = -1;

                        for (int index = 0; index < booksLibrary.size(); index++) {
                            if (booksLibrary.get(index)[0].equalsIgnoreCase(remBookTitle)) {
                                indexToRemove = index;
                                break;
                            }
                        }

                        if (indexToRemove != -1) {
                            booksLibrary.remove(indexToRemove);
                            System.out.println("Book removed successfully.");
                        } else {
                            System.out.println("Book record not found.");
                        }

                        System.out.print("Will you like to remove more book? (yes/no): ");
                        more = input.nextLine();

                        if (more.equalsIgnoreCase("no")) {
                            System.out.println("Thank you");
                            break;
                        } else if (!more.equalsIgnoreCase("yes")) {
                            System.out.println("\tInvalid input");
                        }
                    }
                }

                case 4 -> { 
                    while (true) {
                        System.out.print("Kindly enter the Book Title to update: ");
                        String editBookTitle = input.nextLine();

                        int indexToUpdate = -1;

                        for (int index = 0; index < booksLibrary.size(); index++) {
                            if (booksLibrary.get(index)[0].equalsIgnoreCase(editBookTitle)) {
                                indexToUpdate = index;
                                break;
                            }
                        }

                        if (indexToUpdate != -1) {
                            String[] book = booksLibrary.get(indexToUpdate);

                            System.out.print("Kindly enter the new Book Title: ");
                            book[0] = input.nextLine();

                            System.out.print("Kindly enter the new Number pages: ");
                            book[1] = input.nextLine();

                            System.out.print("Kindly enter the new Name of Author: ");
                            book[2] = input.nextLine();

                            System.out.println("Book Updated successfully.");
                        } else {
                            System.out.println("Book record not found.");
                        }

                        System.out.print("Would you like to update another book? (yes/no): ");
                        more = input.nextLine();

                        if (more.equalsIgnoreCase("no")) {
                            System.out.println("Thank you");
                            break;
                        }
                    }
                }

                case 5 -> { 
                    if (booksLibrary.isEmpty()) {
                        System.out.println("No Books available to show.");
                    } else {
                        System.out.println("\n===== LIST OF ALL BOOKS IN SUGGESTION SYSTEM =====\n");
                        for (int index = 0; index < booksLibrary.size(); index++) {
                            String[] bookRecord = booksLibrary.get(index);
                            System.out.printf("""
                                    Book %d
                                    Title: %s
                                    Pages: %s
                                    Author: %s
                                    
                                    """, index + 1, bookRecord[0], bookRecord[1], bookRecord[2]);
                        }
                    }
                }

                default -> System.out.println("Invalid option!");
            }
        }

        
    }
}

