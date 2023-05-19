package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/** Класс View на вывода на английском языке
 * имплементирует поведение интерфейса iGetView
 */
public class ViewEng implements iGetView{
    /** вывод студентов на консоль из списка */
    public void printAllStudens(List<Student> studens){
        System.out.println("The LIST of Students:");
        for (Student person : studens) {
            System.out.println(person);
        }
        System.out.println("*********the End of the List!*********");

    }
    /**метод для получения выбранной команды на удаление из списка */
    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
    /**
     * измененый метод для получения номера студента для удаления из списка
     * @return возвращает выбранный номер
     */
    public Long promptDel(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, choose student ID you are going to delete: ");
        return in.nextLong();
    }




}