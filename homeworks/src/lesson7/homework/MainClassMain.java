package lesson7.homework;

import lesson7.homework.MainClass.Circle;
import lesson7.homework.MainClass.Calculator;

public class MainClassMain {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 17.0;

		Calculator calculator = new Calculator();
		calculator.calculateCircleLength(circle);

		System.out.println(circle.length);
	}
}
