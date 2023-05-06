/**
* Класс TeacherService реализует интерфейс iUserService для работы с объектами типа Teacher
* В классе реализованы методы для создания, получения списка и сортировки учителей
 **/
package StudentService;

import StudentDomen.Employee;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher>{
    private int count; // счетчик учителей
    private List<Teacher> teachers; // список учителей

    public TeacherService() {
        this.teachers = new ArrayList<>(); // инициализация списка
    }

    @Override
    public List<Teacher> getAll() {
        return teachers; // получение списка всех учителей
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, count, ""); // создание нового учителя без ученой степени
        count++; // увеличение счетчика
        teachers.add(per); // добавление учителя в список
    }

    public void create(String firstName, String secondName, int age, String academicDegree) {
        Teacher per = new Teacher(firstName, secondName, age, count, academicDegree); // создание нового учителя с ученой степенью
        count++; // увеличение счетчика
        teachers.add(per); // добавление учителя в список
    }

    public List<Teacher> getSortedList() {
        List<Teacher> teacherList = new ArrayList<>(teachers); // создание копии списка учителей
        teacherList.sort(new UserComparator<>()); // сортировка списка по фамилии и имени
        return teacherList; // возврат отсортированного списка
    }
}