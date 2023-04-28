import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

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

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);

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

        studentGroups.add(new StudentGroup(listStud));

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
    }
}