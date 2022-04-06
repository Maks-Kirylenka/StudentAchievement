package academic.perfomance.service;

import academic.perfomance.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    transient private static AtomicInteger id = new AtomicInteger(0);

    public void addStudent() {

        System.out.println("Введите фамилию студента");
        String lastName = scanner.next();
        System.out.println("Введите имя студента");
        String firstName = scanner.next();
        System.out.println("Введите курс студента");
        int course = scanner.nextInt();
        System.out.println("Введите группу студента");
        String group = scanner.next();
        students.add(new Student(id.addAndGet(1), lastName, firstName, course, group));

        new MenuService().menu();

    }

    public void removeStudent() {
        System.out.println("Введите id студента");
        int id = scanner.nextInt();

        new MenuService().menu();
    }
}
