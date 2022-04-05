import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().menu();
    }

    private void menu() {
        int num;
        System.out.println("1.Добавлять учащихся студентов. \n"
                + "0.Выход \n"
                + "Введите номер меню"
        );
        num = scanner.nextInt();

        switch (num) {
            case 1: addStudent();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Вы ввели не правильный номер! Введите ещё раз");
                menu();
                break;
        }
    }

    private void addStudent(){
        System.out.println("Введите фамилию студента");
        String lastName = scanner.next();
        System.out.println("Введите имя студента");
        String firstName = scanner.next();
        students.add(new Student(lastName,firstName));
        menu();
    }


}
