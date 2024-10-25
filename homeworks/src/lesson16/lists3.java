package lesson16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lists3 {
	public static void main(String[] args) {
		List<String> friends1 = new ArrayList<>();
		friends1.add("Subhan");
		friends1.add("Efruz");
		friends1.add("Sukran");

		List<String> friends2 = new ArrayList<>();
		friends2.add("Huseyn");
		friends2.add("Memmed");
		friends2.add("Efruz");

		friends1.addAll(friends2); // 5
		System.out.println(friends1);

		Set<String> unique = new HashSet<>(friends1); // 6
		System.out.println(unique);

		String element = "Subhan"; // 7
		System.out.println(friends1.contains(element));

	}
}