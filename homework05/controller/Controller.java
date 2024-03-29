package homework05.controller;

import homework05.model.Student;
import homework05.model.StudyGroup;
import homework05.model.Teacher;
import homework05.service.DataService;
import homework05.service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Белый", "Дмитрий", 2);
        List<Student> students = new ArrayList<>();
        DataService dataService = new DataService();
        dataService.fillListWithStudents(students);
        StudyGroup studyGroupNumber13 = dataService.createStudyGroup(13, teacher, students);
        System.out.println(studyGroupNumber13.getStudents());
        System.out.println(studyGroupNumber13.getTeacher());


    }
}
