package homeworks;

public class Setirler2 {
    public static void main(String[] args) { 
        String name = "Cavid";
        System.out.println(name);

        String message = "Java dili güclü və effektli bir proqramlaşdırma dilidir";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.charAt(2));
        System.out.println(message.indexOf("i"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.contains("iki"));
        System.out.println(message.endsWith("dir"));
        System.out.println(message.startsWith("java"));

        name = "  Adil  ";
        System.out.println(name);
        System.out.println(name.trim());

        name = "Bəxtiyar";
        System.out.println(name.substring(0, 4));

        name = "Əli Həsənov";
        System.out.println(name);

        String[] massiv = name.split(" ");
        for (String n : massiv) {
            System.out.println(n);
        }
    }
}
