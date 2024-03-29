package homework05.service;

import homework05.model.Student;
import homework05.model.StudyGroup;
import homework05.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class StudyGroupService extends StudyGroup{

    public StudyGroup createStudyGroup(int number, Teacher teacher, List<Student> students) {
        return new StudyGroup(number, teacher, students);
    }

}
