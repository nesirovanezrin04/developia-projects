package lesson7.homework;

public class MainClass {
    public static class Circle {
        double radius;
        double length;
    }

    public static class Calculator {
        public void calculateCircleLength(Circle circle) {
            circle.length = 2 * Math.PI * circle.radius; 
        }
    }
}
