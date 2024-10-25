package lesson16;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class tasks2 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); // 3

		queue.add("First");
		queue.add("Second");
		queue.add("Third");

		System.out.println(queue);

		queue.remove();
		queue.remove();

		System.out.println(queue);

		Map<String, String> country = new HashMap<>(); // 4
		country.put("USA", "Washington");
		country.put("France", "Paris");
		country.put("Japan", "Tokyo");

		System.out.println(country);

	}
}