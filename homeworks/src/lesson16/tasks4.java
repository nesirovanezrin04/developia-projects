package lesson16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tasks4 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(); // 9

		names.add("Kamran");
		names.add("Naile");
		names.add("Leman");
		names.add("Nergiz");
		names.add("Natavan");

		System.out.println(names);

		names.remove(2);
		System.out.println(names);

		Set<String> fruits = new HashSet<>(); // 10

		fruits.add("Alma");
		fruits.add("Armud");
		fruits.add("Heyva");
		fruits.add("Nar");

		System.out.println(fruits);

		List<String> fruits2 = new ArrayList<>(fruits);

		System.out.println(fruits2);
	}
}