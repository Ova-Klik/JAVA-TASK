package string;


import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class CookingHealthier {
    static final Map<String, String> SUBSTITUTIONS = new LinkedHashMap<>();

    static {
        SUBSTITUTIONS.put("1 cup sour cream",  "1 cup yogurt");
        SUBSTITUTIONS.put("1 cup milk",         "1/2 cup evaporated milk and 1/2 cup water");
        SUBSTITUTIONS.put("1 teaspoon lemon juice", "1/2 teaspoon vinegar");
        SUBSTITUTIONS.put("1 cup sugar",        "1/2 cup honey or 1 cup molasses");
        SUBSTITUTIONS.put("1 cup butter",       "1 cup margarine or yogurt");
        SUBSTITUTIONS.put("1 cup flour",        "1 cup rye or rice flour");
        SUBSTITUTIONS.put("1 cup mayonnaise",   "1 cup cottage cheese");
        SUBSTITUTIONS.put("1 egg",              "2 tablespoons cornstarch or 2 egg whites");
        SUBSTITUTIONS.put("1/4 cup oil",        "1/4 cup applesauce");
        SUBSTITUTIONS.put("white bread",        "whole-grain bread");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your recipe (empty line to finish):");

        StringBuilder recipe = new StringBuilder();
        String line;
        while (!(line = input.nextLine()).isEmpty())
            recipe.append(line.toLowerCase()).append("\n");

        System.out.println("\nSuggested substitutions:");
        boolean found = false;
        for (Map.Entry<String, String> entry : SUBSTITUTIONS.entrySet())
            if (recipe.toString().contains(entry.getKey().toLowerCase())) {
                System.out.printf("  Replace \"%s\" with \"%s\"%n", entry.getKey(), entry.getValue());
                found = true;
            }

        if (!found)
            System.out.println("No substitutions found for this recipe.");

        System.out.println("\nWARNING: Always consult your physician before making significant changes to your diet.");
    }
}
