package lesson13;

public class Main {
	public static void main(String[] args) {

		Cat cat = new Cat("Pisik", 3);
		cat.makeNoise();

		Dog dog = new Dog("It", 5);
		dog.makeNoise();

		Lion lion = new Lion("Sir", 7);
		lion.makeNoise();
	}
}
