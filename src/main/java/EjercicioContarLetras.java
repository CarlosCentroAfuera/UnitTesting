import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(contarRepeticiones(input));

    }

    public static String contarRepeticiones(String text) {
        if (text == null)
            return null;

        char[] arrayChar = text.toLowerCase().toCharArray();


        HashMap<Character, Integer> map = new HashMap<>();
        for (char character : arrayChar) {
            if (map.containsKey(character)) {
                Integer value = map.get(character);
                value++;
                map.replace(character, value);
            } else {
                map.put(character, 1);
            }
        }
        return map.toString();

    }
}
