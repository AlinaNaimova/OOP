// Класс, представляющий поток студентов

package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {

    private int streamNumber;// номер потока

    private List<StudentGroup> groups;// список групп в потоке

    /**
     * Конструктор класса StudentStream
     * @param streamNumber - номер потока
     * @param listGroups - список групп в потоке
     */

    public StudentStream(int streamNumber, List<StudentGroup> listGroups) {
        this.streamNumber = streamNumber;
        groups = new ArrayList<>();// создание нового списка групп

    }
    /**
     * Метод для добавления группы в поток
     * @param group - группа, которую необходимо добавить
     */

    public void addGroup(StudentGroup group) {
        groups.add(group);// добавление группы в список групп

    }
    /**
     * Метод для получения итератора по списку групп
     * @return - итератор по списку групп
     */

    @Override
    public Iterator<StudentGroup> iterator() {

        return groups.iterator();
    }
    /**
     * Метод для получения номера потока
     * @return - номер потока
     */

    public int getStreamNumber() {

        return streamNumber;
    }

}