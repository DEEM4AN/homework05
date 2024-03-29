package homework05.model;

public class Teacher extends Person {
    private int teacherID;

    public Teacher(String firstName, String secondName, int teacherID) {
        super(firstName, secondName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

   @Override
   public String toString(){
       return "Преподаватель {" + "ID =" + teacherID + " Имя: " + super.getFirstName() + " Фамилия " + super.getSecondName() + "}";
   }

}
