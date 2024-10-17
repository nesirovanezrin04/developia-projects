package lesson14;

public class exceptionPro {
	public static void main(String[] args) {
		exceptionPro object1= new exceptionPro();
		object1.methodA();
	}

	 void methodA() {
		try {
			methodB();
		}catch (ArithmeticException e) {
			System.out.println("exception in methodA "+e.getMessage());
		}
		
	}

	void methodB() {
		int c=4/0;
		System.out.println(c);
		
	}

}
