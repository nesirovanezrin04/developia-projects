package homeworks;

public class ModifiersDemoMain {
	class Student {
		public String name;
		private int age;
		protected String address;
		int id_code;
		public static int money = 0;

		public void method1() {
			if (age >= 17) {
				System.out.println("He is university student");
			} else {
				System.out.println("He is school student");
			}
		}

		private void method2() {
			if (address == "Azerbaijan") {
				System.out.println("His family is from here");

			} else {
				System.out.println("His family isn't from here");
			}
		}

		protected void method3() {
			System.out.println(id_code);

		}

		void method4() {
			System.out.println(name);
		}

		public Student() {

		}

		private Student(String n) {
			name = n;
			System.out.println(name);
		}

		protected Student(String add, int id) {
			address = add;
			id_code = id;
			System.out.println(address + "," + id_code);

		}

		Student(int a) {
			age = a;
			System.out.println(age);
		}

		public void FinalValue(final int number) {
			int score = number;
			System.out.println(score);
		}

	}
}
