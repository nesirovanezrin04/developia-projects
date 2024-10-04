package homeworks;
import java.util.Random;

public class Setirler3 {
    public static void main(String[] args) { 
        char[] massiv = {'f', 'l', 'a', 'g', 'g'};
        System.out.println(String.valueOf(massiv));

        String example = "natural";
        if (example.length() == 3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String word = "";
        System.out.println(word.isEmpty());

        boolean result = newString("Java course", "course");
        System.out.println(result);

        Random random = new Random();
        int min = 10;
        int max = 30;
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println(randomNumber);

        double numberr = 6544.75482;
        System.out.println(String.format("%.2f", numberr));
    }

    public static boolean newString(String s1, String s2) {
        return s1.endsWith(s2);
    }
}
