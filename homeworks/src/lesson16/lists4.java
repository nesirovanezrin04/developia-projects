package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lists4 {
	public static void main(String[] args) {
		Set<Integer> numbers1 = new HashSet<>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);

		Set<Integer> numbers2 = new HashSet<>();
		numbers2.add(3);
		numbers2.add(5);
		numbers2.add(6);

		Set<Integer> union = new HashSet<>(numbers1); // 8
		union.addAll(numbers2);

		Set<Integer> intersection = new HashSet<>(numbers1);
		intersection.retainAll(numbers2);

		System.out.println(union);
		System.out.println(intersection);

	}
}