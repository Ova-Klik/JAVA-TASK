package string;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MetricConversions {
    static final Map<String, Double> TO_BASE = new HashMap<>();
    static final Map<String, String> UNIT_TYPE = new HashMap<>();

    static {
        TO_BASE.put("centimeters", 0.01); TO_BASE.put("meters", 1.0);
        TO_BASE.put("kilometers", 1000.0); TO_BASE.put("inches", 0.0254);
        TO_BASE.put("feet", 0.3048); TO_BASE.put("miles", 1609.34);

        TO_BASE.put("grams", 0.001); TO_BASE.put("kilograms", 1.0);
        TO_BASE.put("pounds", 0.453592); TO_BASE.put("ounces", 0.0283495);

        TO_BASE.put("liters", 1.0); TO_BASE.put("milliliters", 0.001);
        TO_BASE.put("gallons", 3.78541); TO_BASE.put("quarts", 0.946353);

        String[] length = {"centimeters","meters","kilometers","inches","feet","miles"};
        String[] mass   = {"grams","kilograms","pounds","ounces"};
        String[] volume = {"liters","milliliters","gallons","quarts"};

        for (String unit : length) UNIT_TYPE.put(unit, "length");
        for (String unit : mass)   UNIT_TYPE.put(unit, "mass");
        for (String unit : volume) UNIT_TYPE.put(unit, "volume");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many [unit] are in [amount] [unit]? ");
        String[] parts = input.nextLine().toLowerCase().split(" ");

        String toUnit   = parts[2];
        double amount   = Double.parseDouble(parts[5]);
        String fromUnit = parts[6].replaceAll("\\?", "");

        if (!UNIT_TYPE.containsKey(fromUnit) || !UNIT_TYPE.containsKey(toUnit)) {
            System.out.println("Unknown unit.");
        } else if (!UNIT_TYPE.get(fromUnit).equals(UNIT_TYPE.get(toUnit))) {
            System.out.printf("Cannot convert %s to %s (different types).%n", fromUnit, toUnit);
        } else {
            double result = amount * TO_BASE.get(fromUnit) / TO_BASE.get(toUnit);
            System.out.printf("%.4f %s = %.4f %s%n", amount, fromUnit, result, toUnit);
        }
    }
}
