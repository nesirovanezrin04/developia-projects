package lesson16;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); // 9
		queue.add("Efruz");
		queue.add("Melek");
		queue.add("Amin");
		queue.add("Nermin");
		System.out.println(queue);

		queue.clear(); // 10
		System.out.println(queue);

	}

}
