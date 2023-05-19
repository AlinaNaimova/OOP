package Model;
/**Базовый класс, использыемый для наследования */
public class User {
    private String firstName;
    private String secondName;
    private int age;
    /**
     * Конструктор базового класса
     * @param firstName Имя
     * @param secondName Фамиля
     * @param age возраст
     */
    public User(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    /** Переопределение метода toString для верного вывода на консоль */
    @Override
    public String toString(){
        return " User {"
                + "firstName = " + getFirstName()
                + ", secondName = " + getSecondName()
                + ", age = " + getAge()+ "}\n";
    }

}