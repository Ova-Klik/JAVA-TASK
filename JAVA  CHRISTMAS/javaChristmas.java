import java.util.Scanner;

public class JavaChristmas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            String christmasSongPlaylist = """
                    --Twelve Days of Christmas playlist--

                    1.  First day of christmas
                    2.  Second day of christmas
                    3.  Third day of christmas
                    4.  Fourth day of christmas
                    5.  Fifth day of christmas
                    6.  Sixth day of christmas
                    7.  Seventh day of christmas
                    8.  Eight day of christmas
                    9.  Ninth day of christmas
                    10. Tenth day of christmas
                    11. Eleventh day of christmas
                    12. Twelfth day of christmas

                    0.  Exit
                    """;

            System.out.println(christmasSongPlaylist);
            System.out.print("Select the day of christmas: ");
            int christmasPlaylist = input.nextInt();

            if (christmasPlaylist == 0) {
                System.out.println("Merry Christmas and a Happy new year in advance!!!!!");
                break;
            }

            switch (christmasPlaylist) {

                case 1 -> {
                    while (true) {
                        System.out.println("""
                                --First day of christmas--

                                1.  First day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the first day of Christmas
                                    My true love gave to me
                                    A partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 2 -> {
                    while (true) {
                        System.out.println("""
                                --Second day of christmas--

                                1.  Second day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the second day of Christmas
                                    My true love gave to me
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 3 -> {
                    while (true) {
                        System.out.println("""
                                --Third day of christmas--

                                1.  Third day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the third day of Christmas
                                    My true love gave to me
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 4 -> {
                    while (true) {
                        System.out.println("""
                                --Fourth day of christmas--

                                1.  Fourth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the fourth day of Christmas
                                    My true love gave to me
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 5 -> {
                    while (true) {
                        System.out.println("""
                                --Fifth day of christmas--

                                1.  Fifth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the fifth day of Christmas
                                    My true love gave to me
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 6 -> {
                    while (true) {
                        System.out.println("""
                                --Sixth day of christmas--

                                1.  Sixth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the sixth day of Christmas
                                    My true love gave to me
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 7 -> {
                    while (true) {
                        System.out.println("""
                                --Seventh day of christmas--

                                1.  Seventh day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the seventh day of Christmas
                                    My true love gave to me
                                    Seven swans a-swimming
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 8 -> {
                    while (true) {
                        System.out.println("""
                                --Eighth day of christmas--

                                1.  Eighth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the eighth day of Christmas
                                    My true love gave to me
                                    Eight maids a-milking
                                    Seven swans a-swimming
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 9 -> {
                    while (true) {
                        System.out.println("""
                                --Ninth day of christmas--

                                1.  Ninth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the ninth day of Christmas
                                    My true love gave to me
                                    Nine ladies dancing
                                    Eight maids a-milking
                                    Seven swans a-swimming
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 10 -> {
                    while (true) {
                        System.out.println("""
                                --Tenth day of christmas--

                                1.  Tenth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the tenth day of Christmas
                                    My true love gave to me
                                    Ten lords a-leaping
                                    Nine ladies dancing
                                    Eight maids a-milking
                                    Seven swans a-swimming
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 11 -> {
                    while (true) {
                        System.out.println("""
                                --Eleventh day of christmas--

                                1.  Eleventh day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the eleventh day of Christmas
                                    My true love gave to me
                                    Eleven pipers piping
                                    Ten lords a-leaping
                                    Nine ladies dancing
                                    Eight maids a-milking
                                    Seven swans a-swimming
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                case 12 -> {
                    while (true) {
                        System.out.println("""
                                --Twelfth day of christmas--

                                1.  Twelfth day's Lyrics
                                0.  Done.
                                """);

                        int choice = input.nextInt();
                        if (choice == 0) break;

                        switch (choice) {
                            case 1 -> System.out.println("""
                                    On the twelfth day of Christmas
                                    My true love gave to me
                                    Twelve drummers drumming
                                    Eleven pipers piping
                                    Ten lords a-leaping
                                    Nine ladies dancing
                                    Eight maids a-milking
                                    Seven swans a-swimming
                                    Six geese a-laying
                                    Five golden rings
                                    Four calling birds
                                    Three French hens
                                    Two turtle doves
                                    And a partridge in a pear tree
                                    """);
                            default -> System.out.println("Invalid option");
                        }
                    }
                }

                default -> System.out.println("Invalid option");
            }
        }

     
    }
}

