package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lists {
	public static void main(String[] args) {
		List<String> friends = new ArrayList<>(); // 1
		friends.add("Subhan");
		friends.add("Efruz");
		friends.add("Sukran");
		friends.add("Huseyn");
		friends.add("Memmed");

		for (String friend : friends) {
			System.out.println(friend);
		}
		System.out.println("-------------------");
		Collections.reverse(friends); // 2
		for (String friend : friends) {
			System.out.println(friend);
		}
	}
}
