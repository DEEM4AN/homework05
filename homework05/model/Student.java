package homework05.model;

public class Student extends Person{
    private int studentId;


    public Student(String firstName, String secondName, int studentId) {
        super(firstName, secondName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString(){
        return "Студент {" + "ID =" + studentId + " Имя: " + super.getFirstName() + " Фамилия " + super.getSecondName() + "}";
    }
}
