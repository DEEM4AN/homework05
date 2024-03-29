package homework05.model;

import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> students;
    private int numberGroup;

    public StudyGroup() {}

    public StudyGroup(int numberGroup, Teacher teacher, List<Student> students) {
    this.numberGroup = numberGroup;
    this.teacher = teacher;
    this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                ", numberGroup=" + numberGroup +
                '}';
    }
}
