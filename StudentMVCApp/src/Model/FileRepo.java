package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/** класс для записи/чтения студентов из/в файл */
public class FileRepo {
    private String fileName;
    private List<Student> students;

    /**
     * конструктор класса
     *
     * @param fileName имя файла
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * метод добавления студента в список
     *
     * @param student экземпляр класса Student
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /** метод для вывода списка клиентов с файла */
    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /** Метод для записи списка студентов в файл */
    public void saveAllStudentstoFile() {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Student pers : students) {
                fw.write(pers.getFirstName() + " " + pers.getSecondName() + " " + pers.getAge() + " "
                        + pers.getStudentId());
                fw.append("\n");
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * получение списка студентов из файла
     *
     * @return возвращает список студентов
     */
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }

}