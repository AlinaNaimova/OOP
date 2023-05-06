package StudentDomen;

public class Teacher extends User {

    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * Переопределение метода toString для класса Teacher.
     * @return строковое представление объекта.
     */
    @Override
    public String toString() {
        return "\n --Teacher" + "\n" + "{"
                +"firstName=" +super.getFirstName() + ", " + "\n"
                +"secondName=" +super.getSecondName() + ", " + "\n"
                + "age=" +super.getAge() + ", " + "\n" +
                "teacherId=" + teacherId + ", " + "\n" +
                ", academicDegree='" + academicDegree + '\n' +
        '}';
    }

}
