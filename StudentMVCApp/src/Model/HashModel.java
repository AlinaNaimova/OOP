package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import Controller.iGetModel;
import View.ViewEng;
/** Класс для создания хранилища HashMap */
public class HashModel implements iGetModel {
    /**статичное поле с хранилищем */
    private static HashMap<Long, Student> students;
    /**
     * конструктор класса
     * @param students принимает тип HashMap
     */
    public HashModel(HashMap<Long, Student> students) {
        this.students = students;
    }


    /**
     * метод для удаления студента с хранилища
     * @param id принимает параметр с номером клиента для удаления
     */
    public static  void deleteStudent(Long id){
        if(students.containsKey(id)){
            students.remove(id);
            System.out.println("Student with ID " + id + " was deleted successfully!!!");
        }
        else{
            System.out.println("SORRY!! STUDENT NOT FOUND!!!");
        }
    }

    /** метод для получения списка студентов из хранилища  */
    public List<Student> getAllStudent() {
        List<Student>studLs = new ArrayList<Student>();
        for (var student : students.entrySet()) {
            studLs.add(student.getValue());
        }
        return studLs;
    }


    /** дублирующий метод */
    @Override
    public void deleteStudentById(Long id) {
        this.deleteStudent(id);
    }







}