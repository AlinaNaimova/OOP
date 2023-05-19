package Model;

public class Student extends User implements Comparable<Student>{
    private long id;


    public Student(String firstName, String secondName, int age, long id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    public long getStudentId(){
        return this.id;
    }
    public void setStudentId(long id){
        this.id = id;
    }


    @Override
    public int getAge() {
        return super.getAge();
    }


    @Override
    public String getFirstName() {
        return super.getFirstName();
    }


    @Override
    public String getSecondName() {
        return super.getSecondName();
    }


    @Override
    public void setAge(int age) {
        super.setAge(age);
    }


    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }


    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public String toString(){
        return " Student {"
                + "firstName = " + super.getFirstName()
                + ", secondName = " + super.getSecondName()
                + ", age = " + super.getAge()+
                ", studentID = " + id + "}\n";
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge() == o.getAge()) {
            return 0;
        }
        if (this.getAge() > o.getAge()) {
            return 1;
        }
        return -1;
    }


}