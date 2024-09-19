package lesson7.homework;

import lesson7.homework.MethodsReturn.Calculator;

public class MethodsReturnMain {
	public static void main(String[] args) {
        Calculator object = new MethodsReturn().new Calculator();
		
		int average1=object.average(10,20);
		int average2=object.average(15,25);
		
		System.out.println(average1);
		System.out.println(average2);
		
		
		

	}

}
