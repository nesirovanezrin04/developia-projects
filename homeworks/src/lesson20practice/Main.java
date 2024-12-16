package lesson20practice;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        Student student = new Student(1, "Alice", LocalDate.of(2020, 11, 1), 95.0, 92.0, 88.0);
        student.displayInfo();
    }
}

