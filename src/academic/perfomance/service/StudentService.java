package academic.perfomance.service;

import academic.perfomance.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int id=1;
    public void addStudent() {

        System.out.println("Введите фамилию студента");
        String lastName = scanner.next();
        System.out.println("Введите имя студента");
        String firstName = scanner.next();
        students.add(new Student(id++, lastName, firstName));
        new MenuService().menu();

    }

    public void removeStudent(){
        System.out.println("Введите фамилию студента");
        String lastName = scanner.next();
        System.out.println("Введите имя студента");
        String firstName = scanner.next();
        Iterator<Student> studentIterator  = students.iterator();
        while (studentIterator.hasNext()){
            Student nextStudent = studentIterator.next();
            if (nextStudent.getLastName().equals(lastName) && nextStudent.getFirstName().equals(firstName)){
                studentIterator.remove();
            }
        }
        new MenuService().menu();
    }
}
