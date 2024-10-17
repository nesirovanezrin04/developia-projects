package lesson14;

class Lion extends Animal {

	public Lion(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeNoise() {
		System.out.println(name + " Kukremek");
	}
}
