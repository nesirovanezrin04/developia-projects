package homeworks;

public class Computer {
	int id;
	String brand;
	String model;
	String color;

	public Computer() {
	}

	public Computer(String m) {
		model = m;
		System.out.println(model);
	}

	public Computer(String m, String c) {
		model = m;
		color = c;
		System.out.println(model + "," + color);
	}
}
