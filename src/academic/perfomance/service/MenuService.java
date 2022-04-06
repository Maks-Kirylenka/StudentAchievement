package academic.perfomance.service;

import java.util.Scanner;

public class MenuService {

    public static void menu() {
        int num;
        System.out.println("1.Добавлять учащихся студентов. \n"
                + "2.Исключать студентов из курса\n"
                + "0.Выход \n"
                + "Введите номер меню"
        );
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        switch (num) {
            case 1: new StudentService().addStudent();
                break;
            case 2: new StudentService().removeStudent();
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
}
