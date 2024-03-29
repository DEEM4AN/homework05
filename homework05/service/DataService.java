package homework05.service;

import homework05.model.Student;

import java.util.List;
import java.util.Scanner;

public class DataService extends StudyGroupService{
    public void fillListWithStudents(List<Student> students) {
        int num = 0;
        int id = 0;
        Scanner scanner = new Scanner(System.in);
        while (num == 0) {
            System.out.print("Введите фамилию студента или введите STOP для завершения: ");
            String firstName = scanner.nextLine();
            if (firstName.equals("STOP")) {
                num = 1;
                break;
            }
            System.out.print("Введите имя студента: ");
            String secondName = scanner.nextLine();
            id += 1;
            students.add(new Student(firstName, secondName, id));
        }
    }
}
