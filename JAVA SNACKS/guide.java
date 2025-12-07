import java.util.Scanner;

class CustomerService{

	static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);


		String menu = """	
	        WELCOME TO MTN - TECHTRIBE EDITION

	        For English - Press 1
	        For Yoruba - Press 2
	        For Hausa - Press 3
	        For Igbo - Press 4
	        For Pidgin - Press 5

	                """;

	        System.out.print(menu);

	        int generalMenuChoice =  inputCollector.nextInt();

	switch(generalMenuChoice){
	
		case  1 -> {System.out.println("English Menu"); 

		String englishMenu = """

	Press 1 - To Register at Semicolon
	Press 2 - To Register at Amotekun
	Press 3 - To Register for Neighbourhood
	""";
	System.out.println(englishMenu); 
	int englishMenuChoice =  inputCollector.nextInt();
	    switch(englishMenuChoice){
		    case 1 -> {System.out.print("You use your hand enter wahala");
		
	        String englishSemicolonMenu = """

	        Press 1 - To Drop Out
	        """;
	        System.out.println(englishSemicolonMenu); 
	        int englishSemicolonMenuChoice =  inputCollector.nextInt();
	switch(englishSemicolonMenuChoice){
		case 1 -> System.out.print("It's already too late o");
	}

	}
		case 2 -> System.out.print("Amotekun form is still available");
		case 3 -> System.out.print("Free Bicycle available");
		default -> System.out.println("Oga, you no go school");

	}

}
		
		case  2 -> {System.out.printf("Yoruba Menu");

		String yorubaMenu = """

	Te 1 - Lati foruko sile si Semicolon
	Te 2 - Lati foruko sile si  Amotekun
	Te 3 - Lati foruko sile si  Neighbourhood
	""";
	System.out.println(yorubaMenu); 
	int yorubaMenuChoice =  inputCollector.nextInt();
	switch(yorubaMenuChoice){
		case 1 -> System.out.print("E ti wo ooooooooooooooooo");
		case 2 -> System.out.print("E ma gba uniform");
		case 3 -> System.out.print("E ma gba keke");
		default -> System.out.println("Oga, e lo school na");

	}




 }

		case  3 -> System.out.printf("Hausa Menu"); 

		case  4 -> System.out.printf("Igbo Menu");

		case  5 -> System.out.printf("Pidgin Menu"); 

		default -> System.out.println("Oga, you no go school");
	
	}

		



	}

}
