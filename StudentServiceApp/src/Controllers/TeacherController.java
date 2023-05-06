/**
 * Класс TeacherController реализует интерфейс iUserController для управления учителями.
 * В классе создается объект TeacherService для работы с учителями.
**/

package Controllers;

import StudentService.TeacherService;

public class TeacherController implements iUserController{
    final TeacherService dataService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);

    }
}
