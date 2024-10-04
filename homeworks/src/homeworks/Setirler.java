package homeworks;

public class Setirler {
public static void main(String[] args) {
	String name="Məhərrəm";
	System.out.println(name);
	String message="Java dilini öyrənmək maraqlı və faydalıdır";
	System.out.println(message);
	System.out.println(message.length());
	System.out.println(message.charAt(7));
	System.out.println(message.indexOf("n"));
	System.out.println(message.toLowerCase());
	System.out.println(message.toUpperCase());
	System.out.println(message.contains("dilini"));
	System.out.println(message.endsWith("dir"));
	System.out.println(message.startsWith("Java"));
	name="  Ayxan  ";
	System.out.println(name);
	System.out.println(name.trim());
	name="Kamil";
	System.out.println(name.substring(0,4));
	name="«Hüseyn Mehdizadə";
	System.out.println(name);
	String[] massiv=name.split(" ");
	for(String n : massiv) {
		System.out.println(n);

		
	}







}

}
