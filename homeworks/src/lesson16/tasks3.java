package lesson16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tasks3 {
	public static void main(String[] args) {
		List<String> persons = new ArrayList<>(); // 5
		persons.add("Subhan");
		persons.add("Efruz");
		persons.add("Sukran");
		persons.add("Huseyn");
		persons.add("Memmed");

		for (String person : persons) {
			System.out.println(person);
		}

		Set<Integer> primenumbers = new HashSet<>(); // 6

		primenumbers.add(3);
		primenumbers.add(5);
		primenumbers.add(7);
		primenumbers.add(11);
		primenumbers.add(11);

		System.out.println(primenumbers);
	}
}