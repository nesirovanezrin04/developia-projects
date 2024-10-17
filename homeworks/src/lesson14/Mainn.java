package lesson14;

public class Mainn {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John", "Doe", 30, "123456789", "123 Street",
                                    5000.0, "IT", "johndoe", "password123");

        employee1.printInfo();
    }
}
