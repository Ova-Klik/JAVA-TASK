package string;


public class ConvertingIntValuesToChar {
    public static void main(String[] args) {
        for (int code = 0; code <= 255; code++)
            System.out.printf("Code: %3d  Character: %c%n", code, (char) code);
    }
}
