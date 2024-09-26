package homeworks;

import homeworks.ModifiersDemoMain.Student;

public class ModifiersDemo {
	public static void main(String[] args) {

		ModifiersDemoMain newClass = new ModifiersDemoMain();
		Student Student1 = newClass.new Student();
		Student1.name = "Ali";
		// Student1.age=20;
		Student1.address = "Germany";
		Student1.id_code = 007;

		// Student Student1_1 = new Student("Ali");
		Student Student1_2 = newClass.new Student("Germany", 007);

		System.out.println(Student1.name);
		// System.out.println(Student1.age);
		System.out.println(Student1.address);
		System.out.println(Student1.id_code);

		Student1.method1();
		// Student1.method2();
		Student1.method3();
		Student1.method4();

		Student1.FinalValue(10);

		System.out.println(Student1.money);
	}
}
