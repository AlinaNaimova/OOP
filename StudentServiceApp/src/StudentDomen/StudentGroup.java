/**
 * Класс, представляющий группу студентов.
 */
package StudentDomen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;

    /**
     * Конструктор класса.
     * @param students список студентов.
     */
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    /**
     * Геттер для списка студентов.
     * @return список студентов.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Сеттер для списка студентов.
     * @param students список студентов.
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Реализация итератора для класса StudentGroup.
     * @return итератор для списка студентов.
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);
            }

        };
    }

    /**
     * Реализация метода compareTo для сравнения объектов класса StudentGroup.
     * @param o объект класса StudentGroup для сравнения.
     * @return результат сравнения (положительное число, если текущий объект больше переданного,
     * отрицательное, если меньше, и 0, если объекты равны).
     */
    @Override
    public int compareTo(StudentGroup o) {
        //Это сортировка по убыванию - возвращаем отрицательное число
        //return o.getStudents().size() - students.size();
        //Это сортировка по возрастанию - возвращаем положительное число
        return students.size() - o.getStudents().size();
    }

    /**
     * Переопределение метода toString для класса StudentGroup.
     * @return строковое представление объекта.
     */
    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}