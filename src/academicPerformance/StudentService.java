package academicPerformance;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Введите фамилию студента");
        String lastName = scanner.next();
        System.out.println("Введите имя студента");
        String firstName = scanner.next();
        students.add(new Student(lastName, firstName));
        new MenuService().menu();
    }
}
