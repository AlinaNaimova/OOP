/**
 * Обобщенный класс AverageAge для подсчета среднего возраста студентов, учителей и работников
 */
package StudentDomen;

import java.util.List;

public class AverageAge{

    public <T extends User> double calculateAverageAge(List<T> users) {
        double result = 0.0;
        for(int i = 0; i < users.size(); i++) {
            result += users.get(i).getAge();
        }
        return result / users.size();
    }
}