import StudentDomen.*;
import StudentService.TeacherService;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        List<Student> studList = new ArrayList<>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        studList.add(s5);
        studList.add(s6);

        StudentGroup group = new StudentGroup(studList);

        for(Student stud : group)
        {
            System.out.println(stud);
        }

        System.out.println("============= после сортировки =============");
        Collections.sort(group.getStudents());

        for(Student stud : group)
        {
            System.out.println(stud);
        }



        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);


        List<StudentGroup> studentGroups = new ArrayList<>();

        studentGroups.add(new StudentGroup(studList));

        List<Student> listStud2 = new ArrayList<>();
        listStud2.add(s1);
        listStud2.add(s2);
        listStud2.add(s3);
        listStud2.add(s4);

        studentGroups.add(new StudentGroup(listStud2));
        Collections.sort(studentGroups);

        for (int i = 0; i < studentGroups.size(); i++) {
            System.out.println("Students in group #" + (i + 1) + ": " + studentGroups.get(i).getStudents().size());
        }
        System.out.println("Teachers below: ");

        TeacherService teacherService = new TeacherService();
        teacherService.create("Sara", "Smith", 34, "Master");
        teacherService.create("Anthony", "Hopkins", 67, "PhD");
        teacherService.create("Thomas", "Trump", 54, "PhD");
        teacherService.create("Mona", "Stone", 37, "Master");

        System.out.println(teacherService.getSortedList());


        //================================3task
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("dsgsg", "sdgsdg", 111, 1));
        employeeList.add(new Employee("dsgsg", "sdgsdg", 111, 1));
        employeeList.add(new Employee("dsgsg", "sdgsdg", 111, 1));
        employeeList.add(new Employee("dsgsg", "sdgsdg", 111, 1));

        List<User> userList = new ArrayList<>();
        userList.addAll(studList);
        userList.addAll(teacherService.getAll());
        userList.addAll(employeeList);

        AverageAge averageAge = new AverageAge();
        System.out.printf("Average age is %.2f", averageAge.calculateAverageAge(userList));
        //вывод только два знака после запятой

    }
}