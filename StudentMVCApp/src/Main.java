import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetView;
import Controller.iGetModel;
import Model.FileRepo;
import Model.HashModel;
import Model.Student;
import View.ViewEng;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Alex", "Smith", 24, 13);
        Student s2 = new Student("Kate", "Choss", 27, 62);
        Student s3 = new Student("Eugen", "Genge", 37, 367);
        Student s4 = new Student("Igor", "Cage", 23, 37);
        Student s5 = new Student("Toya", "Ori", 27, 36);


        List<Student> studList = new ArrayList<Student>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        studList.add(s5);

        HashMap<Long, Student> hashStudents = new HashMap<>();
        hashStudents.put(s1.getStudentId(), s1);
        hashStudents.put(s2.getStudentId(), s2);
        hashStudents.put(s3.getStudentId(), s3);
        hashStudents.put(s4.getStudentId(), s4);
        hashStudents.put(s5.getStudentId(), s5);

        FileRepo fileRepo = new FileRepo("StudentsDb.txt");
        for (var pers : hashStudents.entrySet()) {
             fileRepo.addStudent(pers.getValue());
        }
        fileRepo.saveAllStudentstoFile();
        iGetModel model  = new HashModel(hashStudents);

        FileRepo modeFileRepo = fileRepo;

        iGetView view = new ViewEng();
        Controller controller = new Controller(view, model);
        controller.run();
        controller.updateView();
    }
}