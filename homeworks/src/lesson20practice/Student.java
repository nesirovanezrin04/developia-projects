package lesson20practice;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int studentId;
    private String name;
    private double subject1Grade;
    private double subject2Grade;
    private double subject3Grade;
    private LocalDate volunteeringDate;

    public Student(int studentId, String name, LocalDate volunteeringDate, double subject1Grade, double subject2Grade, double subject3Grade) {
        this.studentId = studentId;
        this.name = name;
        this.volunteeringDate = volunteeringDate;
        this.subject1Grade = subject1Grade;
        this.subject2Grade = subject2Grade;
        this.subject3Grade = subject3Grade;
    }
    public boolean method() {
        int volunteeringYears = Period.between(volunteeringDate, LocalDate.now()).getYears();

        double averageGrade = (subject1Grade + subject2Grade + subject3Grade) / 3;

        return volunteeringYears > 2 && averageGrade >= 90;
    }

    public void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(volunteeringDate);
        System.out.println(subject1Grade);
        System.out.println(subject2Grade);
        System.out.println(subject3Grade);
    }
}