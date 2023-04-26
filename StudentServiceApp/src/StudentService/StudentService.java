package StudentService;

import StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iUserService<Student> {
    //сквозной номер студентов
    private int count;
    private List<Student> students;


    public StudentService() {
        this.students = new ArrayList<Student>();
    }


    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }

    //method sozdaniya

}
