package lessonn14;

public class multipleExceptions {
	public static void main(String[] args) {
		multipleExceptions object1 = new multipleExceptions();
		object1.methodA();
		object1.methodB();
		object1.methodC();
	}

	void methodC() {
		try {
			int[] array=new int[10];
			System.out.println(array[15]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception in methodC "+ e.getMessage());
		}
	}

	void methodB() {
		try {
			String s1=null;
			System.out.println(s1.length());
		}catch (NullPointerException e) {
			System.out.println("Exception in methodB "+ e.getMessage());
		}
	}

	void methodA() {
		try {
			int c=7/0;
		}catch (ArithmeticException e) {
			System.out.println("Exception in methodA "+ e.getMessage());
		}
		
	}

	}