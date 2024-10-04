package homeworks;
import java.util.Random;

public class Setirler4 {
    public static void main(String[] args) {  
        char[] massiv = {'n', 'e', 'z', 'r', 'i', 'n', 'n'};
        System.out.println(String.valueOf(massiv));

        String example = "classic";
        if (example.length() == 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String word = "hello";
        System.out.println(word.isEmpty());

        String result = newString("Python yaxsidir", "Python", "Java");
        System.out.println(result);

        Random random = new Random();
        int min = 30;
        int max = 50;
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println(randomNumber);

        double number = 25;
        System.out.println(Math.sqrt(number));

        System.out.println(Math.pow(3, number));

        double numberr = 6544.75;
        System.out.println(String.format("%.1f", numberr));
    }

    public static String newString(String s1, String s2, String s3) {
        return s1.replace(s2, s3);
    }
}
